package com.javafusionphp.structural.adapter;

public class AdvanceMediaPlayerImpl implements AdvanceMediaPlayer {

	@Override
	public void playVideo(String fileName) {
		System.out.println("Playing video by AdvanceMediaPlayer.");

	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 by AdvanceMediaPlayer.");

	}

}
