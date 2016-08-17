#db info
CREATE DATABASE video;  # 创建数据库

#用户表
#create TB_USER
CREATE TABLE TB_USER
(
  U_ID INT NOT NULL AUTO_INCREMENT, # 自增id，所属用户id
  USERNAME VARCHAR(30) NOT NULL,    # 用户名
  PASSWORD VARCHAR(30) NOT NULL,    # 密码
  USER_LEVEL VARCHAR(20),           # 用户登记，例如黄金等
  PRIMARY KEY(U_ID)                 # 主健
);
ALTER TABLE TB_USER AUTO_INCREMENT=1001;  # 自增id 1001 开始


################### 以下是没有实行的 ###########################
#create TB_VIDEO
CREATE TABLE TB_VIDEO
(
  V_ID INT NOT NULL,
  V_NAME VARCHAR(100) NOT NULL,
  V_YEAR VARCHAR(30),
  V_TYPE VARCHAR(30),
  V_WATCHNUMBER INT,
  PRIMARY KEY (V_ID)
);

#create TB_LOG
CREATE TABLE TB_LOG
(
  L_ID LONG NOT NULL,
  USER_ID INT NOT NULL,
  LOGIN_TIME VARCHAR(50),
  LOGIN_IP VARCHAR(50)
);