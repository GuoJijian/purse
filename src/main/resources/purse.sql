/* 用户钱包表 */
DROP TABLE IF EXISTS `tbl_balance`;
CREATE TABLE `tbl_balance` (
  `id` char(32) NOT NULL COMMENT '用户号',
  `money` float(0) NOT NULL COMMENT '余额'
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='用户钱包表';
LOCK TABLES `tbl_balance` WRITE;
INSERT INTO `tbl_balance` VALUES ("1",'1000');
UNLOCK TABLES;

/* 钱包余额明细 */
DROP TABLE IF EXISTS `tbl_balance_history`;
CREATE TABLE `tbl_balance_history` (
  `id` char(32) NOT NULL COMMENT '记录号',
  `money` float(0) NOT NULL COMMENT '交易金额',
  `status` char(1) NOT NULL COMMENT '交易类型，0为消费，1为退款',
  `balance_id` char(32) NOT NULL COMMENT '交易人'
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='钱包余额明细表';
LOCK TABLES `tbl_balance_history` WRITE;
UNLOCK TABLES;

/* 订单表 */
DROP TABLE IF EXISTS `tbl_order`;
CREATE TABLE `tbl_balance` (
  `id` char(32) NOT NULL COMMENT '订单号',
  `money` float(0) NOT NULL COMMENT '订单金额',
  `balance_id` char(32) NOT NULL COMMENT '用户号'
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='订单表';
LOCK TABLES `tbl_order` WRITE;
UNLOCK TABLES;