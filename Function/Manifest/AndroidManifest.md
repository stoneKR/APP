## AndroidMenifest 설명
<br>
----------  
+ App의 환경설정
+ manifests Directory에 AndroidManifest에서 변경 가능
+ package="com.example.functionjava"> 이 부분은 무조건 전부 소문자

<br>
### android:allowBackup="true"  
--------  
<br>
<br>
+ App가 파괴 되었을 때 백업을 허용하냐  
<br>
<br>
### android:icon="@mipmap/ic_launcher"  
----------  
<br>
<br>
+ App의 아이콘 선택 가능
<br>
<br>
### android:roundIcon="@mipmap/ic_launcher_round"  
--------  
<br>
<br>
+ roundIcon도 마찬가지로 선택 가능
<br>
<br>
### android:label="@string/app_name"  
--------  
<br>
<br>
+ Values -> string.xml -> app_name string을 가져옴
```
<resources>
    <string name="app_name">FunctionJava</string>
</resources>
```
<br>
<br>
### android:supportsRtl="true"  
---------  
<br>
<br>
+ supportsRtL = Right to Left 약자
+ 오른쪽에서 왼쪽으로 레이아웃을 지정한다.
<br>
<br>
## android:theme="@style/Theme.FunctionJava">  
-----------  
<br>
<br>
+ res -> Values -> themes -> themes.xml
+ App 테마 색상을 지정함
<br>
<br>
```
<resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="Theme.FunctionJava" parent="Theme.MaterialComponents.DayNight.DarkActionBar">
        <!-- Primary brand color. -->
        <item name="colorPrimary">@color/purple_500</item>
        <item name="colorPrimaryVariant">@color/purple_700</item>
        <item name="colorOnPrimary">@color/white</item>
        <!-- Secondary brand color. -->
        <item name="colorSecondary">@color/teal_200</item>
        <item name="colorSecondaryVariant">@color/teal_700</item>
        <item name="colorOnSecondary">@color/black</item>
        <!-- Status bar color. -->
        <item name="android:statusBarColor" tools:targetApi="l">?attr/colorPrimaryVariant</item>
        <!-- Customize your theme here. -->
    </style>
</resources>
```
<br>
<br>
### <activity android:name=".MainActivity">  
---------  
<br>
<br>
```
          <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
```
+ java -> com. -> MainActivity 를 처음 실행
+ MainActivity.java
<br>
<br>

```

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
```
<br>
<br>
+ MainActivity는 extends AppCompatActivity를 상속받는다
+ Ctrl + O 버튼으로 함수 재구성 가능
+ 구글에 android studio life cycle을 검색하면 함수들을 찾을 수 있다

<br>
<br>

## 새로운 Activity 호출
-------------  
<br>
<br>
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

+ SubActivity와 MainActivity가 별 차이 없어보여서 Layout을 하나 더 만듬
+ res -> layout 우클릭 -> New -> Layout Resource File -> activity_sub.xml
```
  
## AndroidMenifest File
-----------
<br>
<br>
```
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.functionjava">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.FunctionJava">
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>
```
  
