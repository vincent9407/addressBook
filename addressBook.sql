CREATE TABLE IF NOT EXISTS users(
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT '自增主键',
    username VARCHAR(100) NOT NULL COMMENT '用户姓名',
    pwd VARCHAR(50) NOT NULL COMMENT '密码',
    company VARCHAR(100) NOT NULL COMMENT '公司名称',
    img VARCHAR(200) COMMENT '头像',
    sex VARCHAR(10) NOT NULL COMMENT '性别',
    phonenumber VARCHAR(100) NOT NULL COMMENT '电话号码',
    address VARCHAR(100) NOT NULL COMMENT '住址',
    birthday DATETIME  NULL COMMENT '生日',
    email    VARCHAR(100) NOT NULL COMMENT '邮箱地址',
    created_at DATETIME NULL COMMENT '创建时间',
    updated_at DATETIME NULL COMMENT '修改时间',
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS groups(
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT '自增主键',
    groupname VARCHAR(100) NOT NULL COMMENT '组别',
    tag VARCHAR(100) NOT NULL COMMENT '标签',
    created_at DATETIME NULL COMMENT '创建时间',
    updated_at DATETIME NULL COMMENT '修改时间',
    PRIMARY KEY (`id`)
);

