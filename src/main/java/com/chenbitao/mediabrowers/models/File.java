package com.chenbitao.mediabrowers.models;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class File implements IFile {

	String name;

	String type;

	long size;

	String updateTime;

	String createTime;
}
