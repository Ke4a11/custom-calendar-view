package com.sample.mycalender;

import java.sql.Date;

import android.os.Parcel;
import android.os.Parcelable;

public class DateInfoParcelable implements Parcelable {
	public static final Parcelable.Creator<DateInfoParcelable> CREATOR
		= new Parcelable.Creator<DateInfoParcelable>() {
		public DateInfoParcelable createFromParcel(Parcel IN) {
			return new DateInfoParcelable(IN);
		}

		public DateInfoParcelable[] newArray(int size) {
			return new DateInfoParcelable[size];
		}
	};

	//	メンバー変数
	protected int year;
	protected int month;	//	0ベースの月
	protected int day;
	protected Date date;


	@Override
	public int describeContents() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		// TODO 自動生成されたメソッド・スタブ
		dest.writeInt(this.year);
		dest.writeInt(this.month);
		dest.writeInt(this.day);
	}

	/**
	 * コンストラクタ
	 */
	public DateInfoParcelable(Parcel parcel) {
		this.year = parcel.readInt();
		this.month = parcel.readInt();
		this.day = parcel.readInt();

		this.initDate();
	}

	public DateInfoParcelable(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;

		this.initDate();
	}

	private void initDate() {
		if (date != null) {
			date = null;	//	メモリの開放
		}

		date = new Date(this.year, this.month, this.day);
	}

	public int getYear() {
		return this.year;
	}

	public int getMonth() {
		return this.month;
	}

	public int getDay() {
		return this.day;
	}
}
