## 새로운 Activity 호출  
-------------  

+ java Directory -> com. Directory 우클릭 New Java Class -> SubActivity -> OK
+ 생성하면 Class만 있을탠데
+ Class뒤에 extends AppCompatActivity 작성 후 Ctrl + O 클릭
+ OnCreate 선택
+ 다음과 같이 됨
+ @Nullable 지워도 괜찮음
+ 그럼 MainActivity랑 구성이 똑같음
+ AndroidManifest에서 .MainActivity 에서 SubActivity로 변경하면
+ Play 했을 시 SubActivity가 호출 됨

```
package com.example.functionjava;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
```

## SubActivity와 MainActivity가 별 차이 없어보여서 Layout을 하나 더 만듬  
----------  
+ res -> layout 우클릭 -> New -> Layout Resource File -> activity_sub.xml   
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android" 
    android:layout_width="match_parent"
    android:layout_height="match_parent">

</LinearLayout>
```

+ ConstraintLayout -> LinearLayout으로 변경
+ Button 추가 -> wrap_content로 지정
+ Button 안에 text 추가
+ textAllCaps -> false 추가하면 소문자 표시 가능

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android" android:layout_width="match_parent"
    android:layout_height="match_parent">

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Send"
        android:textAllCaps="false"
        />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Send"
        android:textAllCaps="false"
        />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Send"
        android:textAllCaps="false"
        />

</LinearLayout>
```
+ 버튼이 가로 배치되는 이유는 LinearLayout이 수평으로 정렬되어서 그럼
+ android:orientation="vertical" 추가해주면 세로배치

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="버튼1" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="버튼2" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="버튼3" />

</LinearLayout>
```
