package ca.ualberta.cs.lonelytwitter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


/**
 * Loads list of previous tweets, and allows user to save new tweets
 * @author Dustin McRorie
 * @version 1.3
 */
public class LonelyTwitterActivity extends Activity {

	private static final String FILENAME = "file1.sav";
	private EditText bodyText;
	private ListView oldTweetsList;
	private ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
	private ArrayAdapter<Tweet> adapter;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bodyText = (EditText) findViewById(R.id.body);
		Button saveButton = (Button) findViewById(R.id.save);
		Button clearButton = (Button) findViewById(R.id.clear);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);


		clearButton.setOnClickListener(new View.OnClickListener() {

			public void onClick (View v) {
				setResult(RESULT_OK);
				tweetList = new ArrayList<Tweet>();

				adapter.clear();
				oldTweetsList.setAdapter(adapter);

				saveInFile();
				//finish();
			}
		});

		saveButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK);
				String text = bodyText.getText().toString();



				if (text.isEmpty())
				{
					//Log.d("LOOOOOOOOOOK AT ME", "text was empty");
					finish();
				}


				else {
					Tweet tweet = new Tweet(text);
					tweetList.add(tweet);
					//Log.d("LOOOOOOOOOOOKKK AT ME", "text not empty");

					saveInFile();
					//saveInFile(text, new Date(System.currentTimeMillis()));
					finish();
				}
			}
		});




	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		//String[] tweets = loadFromFile();

		loadFromFile();

		adapter = new ArrayAdapter<Tweet>(this,
				R.layout.list_item, tweetList);
		oldTweetsList.setAdapter(adapter);

		//android.util.Log.d("CREATE", tweetList.toString());
	}

	private void loadFromFile() {
		//ArrayList<String> tweets = new ArrayList<String>();
		try {
			//FileInputStream fis = openFileInput(FILENAME);
			//BufferedReader in = new BufferedReader(new InputStreamReader(fis));

			FileReader in = new FileReader(new File(getFilesDir(), FILENAME));
			Gson gson = new Gson();

			Type lType = new TypeToken<ArrayList<Tweet>>(){}.getType();

			//DEBUG: This line is problematic
			ArrayList<Tweet> temp = new ArrayList<Tweet>();
			temp = gson.fromJson(in, lType);
			if (temp != null)
				tweetList = temp;
			else
				Log.d("LOOOOOOOOOOOKKK AT ME", "The gson object was a null reference");
			return;
			//String line = in.readLine();
			/*
			while (line != null) {
				tweets.add(line);
				line = in.readLine();
			}
			*/

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private void saveInFile() {
		try {
			//FileOutputStream fos = openFileOutput(FILENAME,
					//Context.MODE_APPEND);
			//BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));

			//taking the tweet list, converting it using Gson
			FileWriter out = new FileWriter(new File(getFilesDir(), FILENAME));
			Gson gson = new Gson();

			gson.toJson(tweetList,out);

			//fos.write(new String(date.toString() + " | " + text).getBytes());
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}