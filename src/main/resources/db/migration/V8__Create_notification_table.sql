CREATE TABLE notification
(
	id BIGINT auto_increment primary key,
	notifier BIGINT not null,
	receiver BIGINT not null,
	outerId BIGINT not null,
	type int not null,
	gmt_create BIGINT not null,
	status int default 0 not null,
);