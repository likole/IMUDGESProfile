create table IMUDGES_PROFILE.Groups
(
	gid int auto_increment
		primary key,
	name varchar(15) not null,
	description varchar(500) null
)
;

create table IMUDGES_PROFILE.Info
(
	id char(10) not null,
	name varchar(30) null,
	gender tinyint(1) null,
	idcard char(18) null,
	bj varchar(100) null,
	zy varchar(100) null
)
;

create table IMUDGES_PROFILE.Member
(
	mid int auto_increment
		primary key,
	sid char(10) not null,
	homepage varchar(100) null,
	gid int null,
	password varchar(32) not null,
	description varchar(5000) null,
	token varchar(32) not null,
	github varchar(100) null,
	qq varchar(13) null,
	email varchar(300) null,
	avatar varchar(50) null
)
;

create table IMUDGES_PROFILE.Picture
(
	pid int auto_increment
		primary key,
	mid int null,
	filename varchar(50) not null,
	constraint PICTURE_MEMBER_mid_fk
		foreign key (mid) references IMUDGES_PROFILE.Member (mid)
)
;

create index PICTURE_MEMBER_mid_fk
	on Picture (mid)
;


