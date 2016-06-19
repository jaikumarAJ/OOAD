package com.javafusionphp.structural.adapter;

import com.javafusionphp.structural.AdapterClass;

public class SimpleMediaPlayerImpl implements SimpleMediaPlayer {

	AdapterClass adapterClass;

	/*
	 * This was no friendship between AdvanceMediaPlayer and SimpleMediaPlayer,
	 * But due to AdapterClass it made possible.
	 * Now we are just asking adapter class to handle some new cases which were out from SimpleMediaPlayer capability. 
	 */
	@Override
	public void play(String audioType, String fileName) {

		if (audioType.equals("mp3")) {
			System.out.println("Playing mp3 by SimpleMediaPlayer itself.");
		}

		// In this line we are taking help of adapter to handle extra cases, which I(SimpleMediaPlayer) do not understand.
		if ((audioType.equals("video")) || (audioType.equals("mp4"))) {
			adapterClass = new AdapterClass(audioType);
			adapterClass.play(audioType, fileName);
		}
	}

}
