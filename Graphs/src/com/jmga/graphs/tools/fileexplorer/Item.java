package com.jmga.graphs.tools.fileexplorer;

public class Item implements Comparable<Item> {
	private String name;
	private String data;
	private String date;
	private String path;
	private String image;
	private boolean isGraph;
	private boolean isDir;

	public Item(String n, String d, String dt, String p, boolean dir) {
		name = n;
		data = d;
		date = dt;
		path = p;
		isDir = dir;
		isGraph = false;
	}

	public String getName() {
		return name;
	}

	public String getData() {
		return data;
	}

	public String getDate() {
		return date;
	}

	public String getPath() {
		return path;
	}

	public boolean getDir() {
		return isDir;
	}

	public void setIsGraph(boolean isGraph) {
		this.isGraph = isGraph;
	}

	public boolean getIsGraph() {
		return isGraph;
	}

	public int compareTo(Item o) {
		if (this.name != null)
			return this.name.toLowerCase().compareTo(o.getName().toLowerCase());
		else
			throw new IllegalArgumentException();
	}
}