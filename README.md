# 호박고구마 (HBGoguma) 중고거래 웹사이트 프로젝트

> "당근마켓"을 모티브로 한 중고거래 플랫폼 구현 프로젝트입니다.  
> 게시글 등록/수정/삭제, 회원관리, 채팅 및 신고기능 등 다양한 사용자 흐름을 구성하였으며  
> 프론트엔드(React)와 백엔드(Spring Boot)를 Docker 기반으로 통합 배포하였습니다.

---

## 기획 목표 및 의도

- 지역 주민들이 안전하고 편리하게 중고 물품을 거래할 수 있는 플랫폼을 구축하여 **신뢰 기반의 커뮤니티 형성**에 기여
- **직거래 활성화**를 통해 택배 거래의 번거로움을 줄이고, 지역 경제 활성화에 이바지
- **지역 인증 시스템**을 도입하여 사기 거래를 예방하고, 안전한 거래 환경을 조성
- **커뮤니티 기능 강화**를 통해 다양한 지역 정보를 공유하고 소통할 수 있는 공간을 제공

---

## 핵심 기능

- 지역 인증 시스템  
- 직거래 매칭 시스템  
- 지역 커뮤니티 기능 (게시판, 채팅 등)  
- 판매자 매너온도 확인  
- 포인트를 활용한 안전 결제 시스템  
- 신고 및 알림 기능  
- 관리자의 유연한 대처 가능

---

## 프로젝트 기간
- 2025.02.18 ~ 2025.02.28 (11일)

---

## 공통 기술 스택

- Frontend: React, JSX, CSS
- Backend: Spring Boot, Java, MyBatis
- Database: MySQL
- DevOps: Docker, EC2, Docker Compose, shell script
- 기타: .env 환경 분리, 자동화 배포 (.bat / .sh)

---

## 백엔드 주요 기능

- 게시글, 회원, 채팅, 리뷰, 신고, 구매 관련 CRUD API 제공
- 구매 희망자 관리 및 채팅 히스토리 처리
- 관리자 신고 감지 로직 (신고 횟수에 따라 색상 점진 변경)
- Global CORS 설정 및 타입 핸들러 적용
- MyBatis 기반 XML 매퍼 구성

---

## 폴더 구조 (일부)

```
src/main/java/himedia/hbgoguma/
├── controller/
│   ├── GogumaPostController.java
│   ├── GogumaChatController.java
│   └── ...
├── service/
│   ├── GogumaPostService.java
│   └── ...
├── repository/vo/
│   ├── GogumaPost.java
│   ├── GogumaUser.java
│   └── ...
├── mybatis/mappers/
│   ├── gogumapost.xml
│   ├── gogumachat.xml
│   └── ...
```

---

## 배포 및 기술 전략

> **Spring Boot, React, Docker**를 활용한 현대적 웹 서비스 개발 및 통합 배포

- **고성능 백엔드 + 반응형 프론트엔드** 조합으로 사용자 경험 극대화
- Spring Boot의 강력한 성능과 React의 유연함으로 **최적의 사용자 중심 웹 서비스** 구현
- **컨테이너 기반의 안정적인 배포 환경** 구축 (Docker)
- 개발 환경과 운영 환경 간의 일관성 유지 + 빠르고 안정적인 배포 실현

### 클라우드 네이티브 기반 확장 전략

- Spring Boot + React + Docker를 활용한 **MSA (Microservice Architecture)** 기반 구조 고려
- 클라우드 환경에 최적화된 배포 전략 및 확장성 있는 구조 설계

### DevOps & CI/CD

- Docker 기반 **CI/CD 파이프라인**을 통해 개발-테스트-배포 자동화
- Mac/Windows 실행 환경을 고려한 자동화 스크립트 작성 (.sh / .bat)
- 최신 웹 개발 트렌드를 반영하여 **지속 가능한 혁신적 서비스 제공**

