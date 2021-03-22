# Android Studio 설명서  

-----------------

## 설치와 셋팅

----------------

+ [0:35](https://www.youtube.com/watch?v=WlJszSmK_es&t=35s)  설치와 셋팅

<br>

-------------------------

<br>

1. 구글에 안드로이드 스튜디오 검색 후 최신버전 설치 
2. 크롬 사용 권장
3. Android Studio 와 Android Virtual Device 둘다 체크 후 Next
4. 디폴트로 진행  
5. Package Name 은 전부 소문자!
6. 언어는 Java로 먼저 진행
7. Minimmum SDK 버전 낮을 수록 100% 지원
8. Finish
9. 오른쪽 하단에 로딩시간 대기
10. Setting 에서 Font 설정

<br>

+ 가상 에뮬레이터 켜기

<br>

------------------------------------------------------

<br>

1. Tools -> AVD Manager 클릭
2. Create Virtual Device 클릭
3. Phone에서 Pixel2 Size 5.0 (1080px X  1920px) 선택 후 Next
4. 가장 무난한 Q선택 없으면 다운로드 후 Next
5. AVD Name 변경없이 하단 Portrait 선택 후 Finish
6. 우측 Play 버튼 클릭

<br>

+ AVD Manager Play 버튼 클릭 후 AVD Manager가 실행되지 않았을 경우

<br>

------------------------------------------------------------

<br>

1. 왼쪽 하단 에 Build 툴 클릭하게 되면 오류들이 나옴 
2. 안티 바이러스 .. 관련 오류는 백신 프로그램에서 탐지 제외 목록에 경로를 추가
3. BIOS 관련 오류는 재부팅 도중 BIOS 접근키를 사용하여 접근   예) F2,F7,F10,Del,등등 회사마다 설정 방법이 다르기 때문에 검색하여 찾음 | 검색어) BIOS VT 설정 (가상화 기술)

<br>

## 프로젝트의 구조 [6:36](https://www.youtube.com/watch?v=WlJszSmK_es&t=396s) 

<br>

----------------------

<br>

+ 

## 매니페스트 [15:04](https://www.youtube.com/watch?v=WlJszSmK_es&t=904s) 

## 생명주기 [18:22](https://www.youtube.com/watch?v=WlJszSmK_es&t=1102s) 

## xml 레이아웃 [21:21](https://www.youtube.com/watch?v=WlJszSmK_es&t=1281s) 

dp, dpi, px, sp [23:25](https://www.youtube.com/watch?v=WlJszSmK_es&t=1405s) 

리니어레이아웃 가중치 [27:04](https://www.youtube.com/watch?v=WlJszSmK_es&t=1624s) 

버튼 클릭 이벤트 [28:46](https://www.youtube.com/watch?v=WlJszSmK_es&t=1726s) 

토스트 [29:13](https://www.youtube.com/watch?v=WlJszSmK_es&t=1753s) 

로그 [33:01](https://www.youtube.com/watch?v=WlJszSmK_es&t=1981s) 

Intent로 액티비티 호출 [34:34](https://www.youtube.com/watch?v=WlJszSmK_es&t=2074s) 

자바와 코틀린의 차이 [39:06](https://www.youtube.com/watch?v=WlJszSmK_es&t=2346s) 

코틀린의 모든것 [43:58](https://www.youtube.com/watch?v=WlJszSmK_es&t=2638s) 

layout_margin  [1:05:15](https://www.youtube.com/watch?v=WlJszSmK_es&t=3915s) 

layout_padding [1:06:45](https://www.youtube.com/watch?v=WlJszSmK_es&t=4005s) 

layout_gravity [1:07:35](https://www.youtube.com/watch?v=WlJszSmK_es&t=4055s) 

gravity [1:09:45](https://www.youtube.com/watch?v=WlJszSmK_es&t=4185s) 

onClick [1:10:56](https://www.youtube.com/watch?v=WlJszSmK_es&t=4256s) 

id [1:11:37](https://www.youtube.com/watch?v=WlJszSmK_es&t=4297s) 

textSize [1:12:03](https://www.youtube.com/watch?v=WlJszSmK_es&t=4323s) 

background (png 이미지 넣기) [1:12:20](https://www.youtube.com/watch?v=WlJszSmK_es&t=4340s) 

autoSizeTextType [1:14:30](https://www.youtube.com/watch?v=WlJszSmK_es&t=4470s) 

drawable [1:14:51](https://www.youtube.com/watch?v=WlJszSmK_es&t=4491s) 

xml로 이미지 사이즈 조절  [1:16:16](https://www.youtube.com/watch?v=WlJszSmK_es&t=4576s) 

autoLink (크롬 접근 권한, 이메일보내기, 한글 키보드, 전화, 맵)  [1:17:22](https://www.youtube.com/watch?v=WlJszSmK_es&t=4642s) 

translationZ  [1:21:09](https://www.youtube.com/watch?v=WlJszSmK_es&t=4869s) 

elevation [1:21:42](https://www.youtube.com/watch?v=WlJszSmK_es&t=4902s) 

shadow [1:21:48](https://www.youtube.com/watch?v=WlJszSmK_es&t=4908s) 

autoSizeStepGranularity [1:22:15](https://www.youtube.com/watch?v=WlJszSmK_es&t=4935s) 

textAllCaps [1:22:34](https://www.youtube.com/watch?v=WlJszSmK_es&t=4954s) 

textColor [1:22:39](https://www.youtube.com/watch?v=WlJszSmK_es&t=4959s) 

foreground [1:22:43](https://www.youtube.com/watch?v=WlJszSmK_es&t=4963s) 

textStyle [1:22:59](https://www.youtube.com/watch?v=WlJszSmK_es&t=4979s) 

fontFamily (폰트) [1:23:06](https://www.youtube.com/watch?v=WlJszSmK_es&t=4986s) 

lineSpacingExtra [1:23:50](https://www.youtube.com/watch?v=WlJszSmK_es&t=5030s) 

visibility [1:24:18](https://www.youtube.com/watch?v=WlJszSmK_es&t=5058s) 

clickable [1:24:57](https://www.youtube.com/watch?v=WlJszSmK_es&t=5097s) 

enabled [1:25:05](https://www.youtube.com/watch?v=WlJszSmK_es&t=5105s) 

tooltipText [1:25:23](https://www.youtube.com/watch?v=WlJszSmK_es&t=5123s) 

outline [1:27:12](https://www.youtube.com/watch?v=WlJszSmK_es&t=5232s) 

xml shape [1:27:38](https://www.youtube.com/watch?v=WlJszSmK_es&t=5258s) 

xml selector [1:34:03](https://www.youtube.com/watch?v=WlJszSmK_es&t=5643s) 

xml layer-list [1:38:31](https://www.youtube.com/watch?v=WlJszSmK_es&t=5911s) 

ems  [1:41:03](https://www.youtube.com/watch?v=WlJszSmK_es&t=6063s) 

inputType [1:41:45](https://www.youtube.com/watch?v=WlJszSmK_es&t=6105s) 

hint [1:42:12](https://www.youtube.com/watch?v=WlJszSmK_es&t=6132s) 

로그인 구현 (엔터 바꾸기, 키보드 숨기기, 인텐트, 저장) [1:43:59](https://www.youtube.com/watch?v=WlJszSmK_es&t=6239s) 

에딧텍스트 [1:53:03](https://www.youtube.com/watch?v=WlJszSmK_es&t=6783s) 

maxLength [1:53:38](https://www.youtube.com/watch?v=WlJszSmK_es&t=6818s) 

cursorVisible [1:53:53](https://www.youtube.com/watch?v=WlJszSmK_es&t=6833s) 

maxHeight, textCursorDrawable [1:53:57](https://www.youtube.com/watch?v=WlJszSmK_es&t=6837s) 

textCursorDrawable, textColorHighlight [1:54:16](https://www.youtube.com/watch?v=WlJszSmK_es&t=6856s) 

src [1:54:30](https://www.youtube.com/watch?v=WlJszSmK_es&t=6870s) 

scaleType [1:55:14](https://www.youtube.com/watch?v=WlJszSmK_es&t=6914s) 

rotation [1:57:20](https://www.youtube.com/watch?v=WlJszSmK_es&t=7040s) 

scaleX [1:57:48](https://www.youtube.com/watch?v=WlJszSmK_es&t=7068s) 

scaleY [1:58:05](https://www.youtube.com/watch?v=WlJszSmK_es&t=7085s) 

alpha [1:58:11](https://www.youtube.com/watch?v=WlJszSmK_es&t=7091s) 

색깔필터  [1:58:20](https://www.youtube.com/watch?v=WlJszSmK_es&t=7100s) 

갤러리에서 사진 가져오기 [1:59:21](https://www.youtube.com/watch?v=WlJszSmK_es&t=7161s) 

원하는 이미지 활성화 [2:03:10](https://www.youtube.com/watch?v=WlJszSmK_es&t=7390s) 

스크롤뷰 [2:07:07](https://www.youtube.com/watch?v=WlJszSmK_es&t=7627s) 

중첩 스크롤뷰 [2:09:41](https://www.youtube.com/watch?v=WlJszSmK_es&t=7781s) 

리스트뷰 [2:11:00](https://www.youtube.com/watch?v=WlJszSmK_es&t=7860s) 

리사이클러뷰 [2:22:09](https://www.youtube.com/watch?v=WlJszSmK_es&t=8529s) 

카드뷰 [2:33:11](https://www.youtube.com/watch?v=WlJszSmK_es&t=9191s) 

아래 네비게이션뷰, 뷰페이저 [2:36:08](https://www.youtube.com/watch?v=WlJszSmK_es&t=9368s) 

탭 레이아웃 [2:46:02](https://www.youtube.com/watch?v=WlJszSmK_es&t=9962s) 

스위치 [2:48:07](https://www.youtube.com/watch?v=WlJszSmK_es&t=10087s) 

텍스트 인풋 레이아웃 [2:49:20](https://www.youtube.com/watch?v=WlJszSmK_es&t=10160s) 

이미지 버튼 [2:49:38](https://www.youtube.com/watch?v=WlJszSmK_es&t=10178s) 

체크박스 [2:50:08](https://www.youtube.com/watch?v=WlJszSmK_es&t=10208s) 

라디오 그룹, 라디오 버튼 [2:50:52](https://www.youtube.com/watch?v=WlJszSmK_es&t=10252s) 

토글 버튼 [2:52:23](https://www.youtube.com/watch?v=WlJszSmK_es&t=10343s) 

플로팅 액션 버튼, 스낵바 [2:52:46](https://www.youtube.com/watch?v=WlJszSmK_es&t=10366s) 

뷰 [2:54:08](https://www.youtube.com/watch?v=WlJszSmK_es&t=10448s) 

이미지뷰 (srcCompat) [2:54:39](https://www.youtube.com/watch?v=WlJszSmK_es&t=10479s) 

웹뷰 (빠르게 두번 눌러 종료) [2:55:26](https://www.youtube.com/watch?v=WlJszSmK_es&t=10526s) 

비디오뷰 [2:58:53](https://www.youtube.com/watch?v=WlJszSmK_es&t=10733s) 

캘린더뷰 [3:03:19](https://www.youtube.com/watch?v=WlJszSmK_es&t=10999s) 

프로그래스바 (timer, runOnUiThread, Timer().schedule, Handler().postDelayed) [3:05:27](https://www.youtube.com/watch?v=WlJszSmK_es&t=11127s) 

시크바 [3:09:44](https://www.youtube.com/watch?v=WlJszSmK_es&t=11384s) 

레이팅바 [3:11:09](https://www.youtube.com/watch?v=WlJszSmK_es&t=11469s) 

서치뷰 (검색) [3:11:36](https://www.youtube.com/watch?v=WlJszSmK_es&t=11496s) 

디바이더 [3:13:28](https://www.youtube.com/watch?v=WlJszSmK_es&t=11608s) 

콘스트레인츠 레이아웃 [3:13:41](https://www.youtube.com/watch?v=WlJszSmK_es&t=11621s) 

가이드라인 [3:17:44](https://www.youtube.com/watch?v=WlJszSmK_es&t=11864s) 

리니어 레이아웃 [3:18:27](https://www.youtube.com/watch?v=WlJszSmK_es&t=11907s) 

프레임 레이아웃 [3:20:32](https://www.youtube.com/watch?v=WlJszSmK_es&t=12032s) 

테이블 레이아웃 [3:20:56](https://www.youtube.com/watch?v=WlJszSmK_es&t=12056s) 

스페이스 [3:22:59](https://www.youtube.com/watch?v=WlJszSmK_es&t=12179s) 

스피너 [3:23:09](https://www.youtube.com/watch?v=WlJszSmK_es&t=12189s) 

네스티드 스크롤뷰 [3:24:27](https://www.youtube.com/watch?v=WlJszSmK_es&t=12267s) 

앱바 레이아웃 [3:25:56](https://www.youtube.com/watch?v=WlJszSmK_es&t=12356s) 

네비게이션 뷰 [3:28:20](https://www.youtube.com/watch?v=WlJszSmK_es&t=12500s) 

툴바  [3:31:58](https://www.youtube.com/watch?v=WlJszSmK_es&t=12718s) 

진동 (apk, 구글용 apk, 핸드폰 연결) [3:33:17](https://www.youtube.com/watch?v=WlJszSmK_es&t=12797s) 

볼륨조절 [3:36:12](https://www.youtube.com/watch?v=WlJszSmK_es&t=12972s) 

타임피커 [3:37:19](https://www.youtube.com/watch?v=WlJszSmK_es&t=13039s) 

푸쉬알람 [3:38:51](https://www.youtube.com/watch?v=WlJszSmK_es&t=13131s) 

데이터 저장, 불러오기 [3:40:25](https://www.youtube.com/watch?v=WlJszSmK_es&t=13225s) 

동작센서 (lateinit) [3:41:10](https://www.youtube.com/watch?v=WlJszSmK_es&t=13270s) 

네트워크 연결 [3:44:17](https://www.youtube.com/watch?v=WlJszSmK_es&t=13457s) 

음악재생 [3:45:06](https://www.youtube.com/watch?v=WlJszSmK_es&t=13506s) 

프래그먼트 [3:45:52](https://www.youtube.com/watch?v=WlJszSmK_es&t=13552s) 

인클루드 [3:48:02](https://www.youtube.com/watch?v=WlJszSmK_es&t=13682s) 

다이얼로그 [3:48:33](https://www.youtube.com/watch?v=WlJszSmK_es&t=13713s) 

공유 [3:49:14](https://www.youtube.com/watch?v=WlJszSmK_es&t=13754s) 

애니메이션 [3:49:49](https://www.youtube.com/watch?v=WlJszSmK_es&t=13789s) 

나인패치 [3:50:59](https://www.youtube.com/watch?v=WlJszSmK_es&t=13859s) 