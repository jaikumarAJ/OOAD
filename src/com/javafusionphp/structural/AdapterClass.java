package com.javafusionphp.structural;

import com.javafusionphp.structural.adapter.AdvanceMediaPlayer;
import com.javafusionphp.structural.adapter.AdvanceMediaPlayerImpl;
import com.javafusionphp.structural.adapter.SimpleMediaPlayer;

public class AdapterClass implements SimpleMediaPlayer {
	AdvanceMediaPlayer advanceMediaPlayer;

	public AdapterClass(String audioType) {
		if ((audioType.equals("video")) || (audioType.equals("mp4"))) {
			advanceMediaPlayer = new AdvanceMediaPlayerImpl();
		}
	}

	/*
	 * Don't worry SimpleMediaPlayer class you just call you implement method play() and 
	 * I will call corresponding method of  AdvanceMediaPlayer.
	 * He is like bichwan(used for a person who is between bride and groom family).
	 */
	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equals("video")) {
			advanceMediaPlayer.playVideo(fileName);
		}
		if (audioType.equals("mp4")) {
			advanceMediaPlayer.playMp4(fileName);
		}
	}

}
