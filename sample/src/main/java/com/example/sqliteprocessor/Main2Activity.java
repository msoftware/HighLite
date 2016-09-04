package com.example.sqliteprocessor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jeppeman.sqliteprocessor.SQLiteOperator;

import java.util.Arrays;

import rx.Subscriber;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        SQLiteOperator.getSingle(this, MyLittleClass.class, 1)
//                .map(new Func1<MyLittleClass, String>() {
//                    @Override
//                    public String call(MyLittleClass myLittleClass) {
//                        return myLittleClass.name;
//                    }
//                })
//                .subscribe(new Subscriber<String>() {
//                    @Override
//                    public void onCompleted() {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Log.e("err", "err", e);
//                    }
//
//                    @Override
//                    public void onNext(String myLittleClass) {
//
//                    }
//                });

        final MyLittleClass tester = new MyLittleClass();
        tester.name = "Karl Johan";
        tester.nameList = Arrays.asList("a", "b", "c");
        tester.shortz = 60;

        SQLiteOperator.getSingle(this, MyLittleClass.class, 1)
                .subscribe(new Subscriber<MyLittleClass>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(MyLittleClass myLittleClass) {

                    }
                });

//        SQLiteOperator.insert(this, tester)
//                .subscribe(new Subscriber<MyLittleClass>() {
//                    @Override
//                    public void onCompleted() {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onNext(MyLittleClass myLittleClass) {
//
//                    }
//                });
    }
}