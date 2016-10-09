package com.example.sqliteprocessor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jeppeman.sqliteprocessor.SQLiteOperator;

import rx.Subscriber;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final SQLiteOperator<MyLittleClass2> operator = SQLiteOperator.from(this,
                MyLittleClass2.class);
        operator
                .getList()
                .execute()
                .subscribe(new Subscriber<MyLittleClass2>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(MyLittleClass2 myLittleClass2) {

                    }
                });

//        MyLittleClass m = new MyLittleClass();
//        m.name = "asdf";
//        m.nameList = Arrays.asList("a, ", "c", "b");
//        m.foreign = 7;
//        SQLiteOperator.from(this, MyLittleClass.class)
//                .insert(m)
//                .execute()
//                .subscribe(new Completable.CompletableSubscriber() {
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
//                    public void onSubscribe(Subscription d) {
//
//                    }
//                });
    }
}