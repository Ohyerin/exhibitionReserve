# exhibitionReserve

### 전시회 예약 사이트 project

## 만든 의도와 기능

인터넷에서 예약할 수 있는 ‘네이버 예약’ 플랫폼이 실재하고 있긴 하지만, 
웹 페이지 하나를 만들어서 그 안에서 전시 예정 중이거나 전시 중인 전시회들이 뭐가 있는지 둘러보고,  바로 예약할 수 있는 기능을 가진 
하나의 웹 사이트를 만들면 더 편리하지 않을까해서 구상해보게 되었습니다. 전시중인 전시회를 둘러볼 수 있고, 마이 페이지에 들어가 내 정보를 확인할 수 있습니다. 
전시회들은 테마별로  예술이면 예술관련 전시회, 가족이면 가족관련 전시회 등 테마별로 나누어서 볼 수 있는 서비스를 추가했습니다.
프로젝트를 다 완성하지 못하여 주된 기능인 예약 서비스를 구현해내지 못했지만 완성하게 된다면 전시회를 예약할 수 있고 내 예약기록을 확인할 수 있습니다. 


## 구조

![구조조](https://user-images.githubusercontent.com/82960864/122074035-d826af80-ce33-11eb-89e2-041c7b555495.jpg)
1. 처음 사이트에 접속하면 메인화면인 index.jsp가 뜬다.
2. login) loginController를 통해 login.jsp이동
2-1. join) JoinController를 통해 join.jsp이동
3. login후 메인화면인 userMain.jsp 
4. mypage) 내정보와 내가 예약한 전시회를 확인할 수 있는 화면. ViewMineController를 통해 myPage.jsp이동
5. reserveList) 전시회리스트. 카테고리별로 전시회를 확인할 수 있다. ViewListController를 통해 reserveList.jsp이동

* 구조는 제가 구현해놓은데까지 작성했습니다.
