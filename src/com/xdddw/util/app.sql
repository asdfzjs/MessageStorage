/*
Navicat MySQL Data Transfer

Source Server         : xdddw.com
Source Server Version : 50627
Source Host           : xdddw.com:3306
Source Database       : app

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2016-05-30 23:19:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for content
-- ----------------------------
DROP TABLE IF EXISTS `content`;
CREATE TABLE `content` (
  `content` text NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `addTime` date NOT NULL,
  `image` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of content
-- ----------------------------
INSERT INTO `content` VALUES (' 昆山锐锋硬质合金公司，成立于2006年。公司有一支专业的采购回收队伍，业务能力强，作风严谨.服务到位，长三角范围内上门收货.方便快捷.结算方式灵活；公司实力雄厚.注重信誉.产品收购价格优势明显。小批量的业务，可以用物流快递公司办理，公司负责报销托运费用，货款可以让物流公司代收，极大的方便了路途远数量小的客户。\r\n\r\n我公司长期收购废旧硬质合金钨钢，高速钢并长年采购： \r\n一. 各种废铣刀片、钻头、立铣刀、数控刀具、线切割钨钢模具、拉丝模具、圆切刀、锯片、顶锤、 PCB钻头、V-CUT、锣刀、高比重合金、无磁合金、钨钢粉末\r\n二. 各种废旧高速钢：铣刀，车刀、铰刀、滚刀、拉刀、刨刀、镗刀、螺纹梳刀、刮刀、钻头，丝锥、丝攻、齿轮刀、插齿刀、剃齿刀、锯片、粉末冶金高速钢 \r\n三. 钼丝、镍珠、镍板，二手刀具等\r\n\r\n我公司收购办法简便，直接现金结算，价格合理，公道，诚信经营。长期面向各模具厂，电子厂，五金加工厂，机械加工厂，模胚厂，电镀厂，不分生产厂家，销售，加工，只要是钨钴合金废料，大量回收，如贵公司有货或在其他单位能联系到货源，欢迎中介，定重酬！感谢能来电联系！我们将以诚信与您合作！ \r\n数量不限、现金收购！', '1', '回收镍珠', '2016-03-24', 'http://www.xdddw.com/file/upload/201603/24/11-15-41-25-14194.jpg.middle.jpg');
INSERT INTO `content` VALUES ('省级定点基地\r\n麻涌镇豪丰电镀、印染专业基地规划总面积1500亩，是东莞市政府于2006年11月规划设立的环保专业基地之一，并于2007年10月获得省环保厅批复同意建设，是东莞市唯一允许新建电镀、印染项目的省级环保定点专业基地。省、市、镇各级政府主管部门大力支持基地的建设及发展，目前已有近百家国内外知名企业入驻。\r\n \r\n半小时经济圈\r\n基地坐落于东莞市麻涌镇东部，处于珠江三角洲经济产业区的核心地带。依托便捷的交通网络，半小时可通达深圳、广州，具有明显聚集效应和物流枢纽中心优势。\r\n高速公路：紧依广深高速、沿江高速、广园快速\r\n轨道交通：莞惠城轨（轻轨）、东莞地铁R1线\r\n航空：深圳机场，广州机场\r\n水路：南依虎门港、新沙港\r\n \r\n完善配套设施\r\n废水处理厂：日处理7.5万吨的集中污水处理厂。\r\n排污泵站：10万吨级的排污泵站，13公里长的排污专管，将处理达标后的工业废水输送至狮子洋深海排放。\r\n供热：三台75吨的供热锅炉，通过供热管线，为印染企业供应蒸汽。\r\n供水：基地自备供水厂。\r\n宿舍、银行、餐饮、生活超市、医疗、邮政、快递、文化、体育等一应俱全，齐全的生活配套设施，为员工提供便利的生活。\r\n \r\n一站式服务\r\n基地专门成立招商客服中心，技术工程部等五大服务部门，拥有一批高素质的环保专业人才和运营团队，构建立体化、全方位、高效率的服务体系，形成“决策简捷、沟通便捷、执行快捷”的服务机制，为企业提供包括立项审批、证件办理、技术支持、生产运营、招聘、食宿等便捷服务。\r\n通过不断创新服务方式、忧化服务手段，打造一流营商环境助推企业升级发展。', '2', '省批电镀基地,豪丰环保,麻涌豪丰,东莞麻涌电镀', '2016-03-23', 'http://www.xdddw.com/file/upload/201509/09/13-45-36-95-10935.jpg.middle.jpg');
INSERT INTO `content` VALUES ('题述产品电镀需求如下，请有意者并能接单企业尽快与我方联系！\r\n\r\n现代电镀网联系方式：\r\n咨询热线：（86）－21-6094 9668\r\n邮箱：info@xdddw.com\r\n微信号：xdddw1234（最及时的发单求购信息，实时推送）\r\n公众号：现代电镀网（每日电镀行业最新资讯推送）。\r\n\r\n需求电镀产品基材：不锈钢\r\n需求电镀产品镀种：紫铜，不起皮，脱落\r\n需求电镀产品数量：2W*2\r\n发单企业地址：宁波\r\n图片是实物', '3', '寻求电镀加工-不锈钢局部镀紫铜（宁波）', '2016-03-22', 'http://www.xdddw.com/file/upload/201603/24/14-07-40-81-10833.jpg.middle.jpg');
INSERT INTO `content` VALUES ('新乡市景龙复合材料有限公司始建于一九九五年，是目前国内为数不多的专业生产玻璃钢异型材拉挤模具的企业，也是国内较早生产此项产品的厂家。占地面积1500平方米，总投资100万　本公司拥有雄厚的机械加工能力，在长达十年的生产实践中，公司积累了丰富的经验和生产诀窍，汇集了国内精良的机械制造设备：并拥有完善的电镀生产线。高级工程师三人，模具设计人员五人，高级钳工十六人、高级模具技工二十三人、电镀工程师一名，公司创始人高级工程师康景龙先生多次到加拿大和日本进行积极广泛的学术交流，与武汉工业大学、南京玻纤院密切协作，产、学、研横向联合，吸收和消化了表面处理学与复合材料学科的先进科研成果。拥有了自己独到而系统的生产工艺软件，培养了一批懂技术、能力强、操作熟练的技术能手，为客户有效地解决了实际生产中出现的各种技术问题，大大提高了生产效率，深得客户称赞。　十年间我们为玻璃钢厂家设计制造了各种规格的玻璃钢拉挤模具。产品远销于北京、南京、天津、广州、石家庄、秦皇岛、山东、山西等地，与全国近百家玻璃钢企业建立了良好的合作关系，得到了用户的好评和认可。<br><br>    本公司还通过吸取国际玻璃钢生产的技术和工艺，结合国内实际生产情况，自行研制设备并进行种类繁多的拉挤型材生产。根据客户需要订做各种模具和型材，并可组装梯子等产品。以优异的质量，良好的服务享誉业界。 <br><br>　　公司自创立之初，始终致力于质量管理工作，质量是我们企业生命的之源。从原材料进厂到各个生产工艺，再到最后出厂检测，我们都严把质量关，对不合格的产品绝不出厂，宁可提高产品成本，也要保证模具的精度和材质  　精、优、勤、诚是我们一贯的准则，快速高效，顾客第一，您的需求也正是我们的需求，您的满意是我们的服务标准，决不辜负客户多年来对我们的信赖，愿我们的努力成为你最终的选择。“市场经济，鱼目混珠“，近来有个别企业未经我公司同意，擅自使用我公司模具照片及相关介绍，我公司特提醒广大用户，“隔行如隔山“，请您一定认准专业生产制造商！', '4', '电镀加工', '2016-03-14', 'http://www.xdddw.com/file/upload/201603/24/10-48-24-59-14194.jpg.middle.jpg');
INSERT INTO `content` VALUES ('需求电镀产品基材：钢材刀具刀柄\r\n需求电镀产品镀种：如图所示颜色\r\n需求电镀产品数量：试验阶段，后期量大\r\n发单企业地址：山西太原\r\n图片是实物', '5', '寻求电镀加工-钢材刀具镀颜色（山西太原）', '2016-03-01', 'http://www.xdddw.com/file/upload/201603/23/13-59-29-52-10833.jpg.middle.jpg');
INSERT INTO `content` VALUES (' 东莞市东兴机械设备厂注册于2003年，座落于风景怡人的松山湖附近，是一间拥有先进机械设备，高素质员工，雄厚的技术实力，严格的管理体制和集丰富经验的厂家。现有专业开发设计人员8人，工程师10人，高素质员工30人。<br>   工业自动化生产设备，引进国外先进工艺及生产，服务工作。凭借雄厚的技术实力，可靠的产品质量，完善的质量控制系统和周到快捷的售后服务体系，赢得了广大用户的信任和支持。<br>   本着以科技为先导，市场为依托，服务为保证的经营思想。以进口机的质量，国产机的价格，促进企业蓬勃发展，我厂生产的产品已落户各大行业，包括塑料，医药，食品，化工，五金电镀，电子，光学，光盘音像业，纺织，喷涂，民用建筑。<br>   厂训：以质量求生存，以科技求创新，以市场为导向，以用户为上帝<br>   竭诚与各界新老客户合作双赢，共创明日辉煌。  可根据客户实际情况设计定做之规格', '6', '五金电镀', '2016-03-03', 'http://www.xdddw.com/file/upload/201603/23/15-43-36-28-14194.jpg.middle.jpg');
INSERT INTO `content` VALUES ('将钢件经预处理后,浸入热液(浸度低于100℃)中,浸镀一段时间(速度为10～15Mm/h)于其表面即形成一镍合金成。此种合金层表面光亮,较电镀耐蚀,是将碳素钢装饰成类似不锈钢的优良工艺', '7', '热浸锌', '2016-03-15', 'http://www.xdddw.com/file/upload/201603/23/15-30-52-34-14194.jpg.middle.jpg');
INSERT INTO `content` VALUES ('招租园区地址：深圳市宝安区公明镇\r\n招租园区信息：6千余平方，租金45/平、污水处理28-32/吨。层高6米高\r\n图片不是实物图，详情可联系发单方', '8', '电镀厂房招租-深圳宝安', '2016-03-19', 'http://www.xdddw.com/file/upload/201603/22/15-46-59-83-10833.jpg.middle.jpg');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '15921952463', '123456');
INSERT INTO `user` VALUES ('2', '13040281813', '123456');