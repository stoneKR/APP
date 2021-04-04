## 버튼을 클릭했을 때 이벤트로 Log 찍기
--------- 
+ SubActivity

```
        Button Btn2 = findViewById(R.id.Btn2);
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("태그", "값");
            }
        });
```
+ activity_sub.xml

```
    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="버튼2"
        android:id="@+id/Btn2" />
```
+ 버튼에 id 지정 후 버튼 클릭했을 때 log 찍도록 설정
