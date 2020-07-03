create table movieTest(
id varchar2(21),
name varchar2(21),
title varchar2(21),
theater varchar2(21),
day varchar2(21),
howMany number(2),
cost number(10),
seatNumber varchar2(21)
)

create table member_table(
mid varchar2(21),
mname varchar2(21)
constraint fk_member_table_mid foreign key(mid) references movieTest(id)
)

create table movie_table(
mvid varchar2(21),
title varchar2(60)
)