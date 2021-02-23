package com.project.demo;

public class TextComic {

	private String name;

	private String imagefile;

	private Integer countOfPages;

	private Double bookNumber;
	
	public TextComic() {}
	public TextComic(String name, String imagefile, Integer countOfPages, Double bookNumber) {
		
		this.name = name;
		this.imagefile = imagefile;
		this.countOfPages = countOfPages;
		this.bookNumber = bookNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImagefile() {
		return imagefile;
	}

	public void setImagefile(String imagefile) {
		this.imagefile = imagefile;
	}

	public Integer getCountOfPages() {
		return countOfPages;
	}

	public void setCountOfPages(Integer countOfPages) {
		this.countOfPages = countOfPages;
	}

	public Double getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(Double bookNumber) {
		this.bookNumber = bookNumber;
	}


}
