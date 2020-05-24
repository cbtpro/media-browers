package com.chenbitao.mediabrowers.constants;

import lombok.Getter;
import lombok.Setter;

public enum EFileType {

	JPG("jpg", "jpg"), JPEG("jpeg", "jpeg"), PNG("png", "png"), GIF("gif", "gif"), WEBP("webp", "webp"),
	MP3("mp3", "mp3"), MP4("mp4", "mp4");

	@Getter
	@Setter
	private String name;

	@Getter
	@Setter
	private String type;

	private EFileType(String name, String type) {
		this.name = name;
		this.type = type;
	}
}
