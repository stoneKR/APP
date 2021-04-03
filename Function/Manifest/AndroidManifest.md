## AndroidMenifest 설명
  
----------  
+ App의 환경설정
+ manifests Directory에 AndroidManifest에서 변경 가능
+ package="com.example.functionjava"> 이 부분은 무조건 전부 소문자


### android:allowBackup="true"  
--------  
  
+ App가 파괴 되었을 때 백업을 허용하냐  

### android:icon="@mipmap/ic_launcher"  
----------  

+ App의 아이콘 선택 가능

### android:roundIcon="@mipmap/ic_launcher_round"  
--------  

+ roundIcon도 마찬가지로 선택 가능

### android:label="@string/app_name"  
--------  

+ Values -> string.xml -> app_name string을 가져옴
```
<resources>
    <string name="app_name">FunctionJava</string>
</resources>
```

### android:supportsRtl="true"  
---------  

+ supportsRtL = Right to Left 약자
+ 오른쪽에서 왼쪽으로 레이아웃을 지정한다.

## android:theme="@style/Theme.FunctionJava">  
-----------  

+ res -> Values -> themes -> themes.xml
+ App 테마 색상을 지정함

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

### <activity android:name=".MainActivity">  
---------  
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

```
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
```

+ MainActivity는 extends AppCompatActivity를 상속받는다
+ Ctrl + O 버튼으로 함수 재구성 가능
+ 구글에 android studio life cycle을 검색하면 함수들을 찾을 수 있다

## 새로운 Activity 호출
-------------  


  
  
## AndroidMenifest File

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
  
