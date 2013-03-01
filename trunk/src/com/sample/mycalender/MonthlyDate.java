package com.sample.mycalender;

import java.util.Calendar;

public class MonthlyDate {
	private int year;
	private int month;
	private int dayOfMonth;
	private int dayOfWeekIndex;

	private Calendar calendar = Calendar.getInstance();

	/**
	 * コンストラクタ
	 */
	public MonthlyDate(int year, int month) {
		this.init(year, month, 1);
	}

	public MonthlyDate(int year, int month, int dayOfMonth) {
		this.init(year, month, dayOfMonth);
	}

	private void init(int year, int month, int dayOfMonth) {
		this.year = year;
		this.month = month;
		this.dayOfMonth = dayOfMonth;

		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);


	}

	/**
	 * 現在の西暦年を返す
	 * @return 現在の西暦年
	 */
	public int getYear() {
		return this.year;
	}

	/**
	 * 現在の月を返す
	 * @return 現在の年
	 */
	public int getMonth() {
		return this.month;
	}

	/**
	 * 月の日付を返す
	 * @return	月の日にち
	 */
	public int getDate() {
		return this.dayOfMonth;
	}

	public int getDayOfWeek() {
		return this.dayOfWeekIndex;
	}

	public void setDate(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}
}
