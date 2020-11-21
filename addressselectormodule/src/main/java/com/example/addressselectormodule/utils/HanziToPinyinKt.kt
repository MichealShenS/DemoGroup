package com.example.addressselectormodule.utils

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/10/14 14:06
 * Description:
 */
class HanziToPinyinKt {

    private final val TAG = "HanziToPinyin"
    private final val DEBUG = false
    final val UNIHANS = charArrayOf(
        '阿', '哎', '安', '肮', '凹', '八', '挀', '扳',
        '邦', '勹', '陂', '奔', '伻', '屄', '边', '灬', '憋', '汃',
        '冫', '癶', '峬', '嚓', '偲', '参', '仓', '撡', '冊', '嵾', '曽',
        '曾', '層', '叉', '芆', '辿', '伥', '抄', '车', '抻', '沈', '沉',
        '阷', '吃', '充', '抽', '出', '欻', '揣', '巛', '刅', '吹', '旾',
        '逴', '呲', '匆', '凑', '粗', '汆', '崔', '邨', '搓', '咑', '呆',
        '丹', '当', '刀', '嘚', '扥', '灯', '氐', '嗲', '甸', '刁', '爹',
        '丁', '丟', '东', '吺', '厾', '耑', '襨', '吨', '多', '妸', '诶',
        '奀', '鞥', '儿', '发', '帆', '匚', '飞', '分', '丰', '覅', '仏',
        '紑', '伕', '旮', '侅', '甘', '冈', '皋', '戈', '给', '根', '刯',
        '工', '勾', '估', '瓜', '乖', '关', '光', '归', '丨', '呙', '哈',
        '咍', '佄', '夯', '茠', '诃', '黒', '拫', '亨', '噷', '叿', '齁',
        '乯', '花', '怀', '犿', '巟', '灰', '昏', '吙', '丌', '加', '戋',
        '江', '艽', '阶', '巾', '坕', '冂', '丩', '凥', '姢', '噘', '军',
        '咔', '开', '刊', '忼', '尻', '匼', '肎', '劥', '空', '抠', '扝',
        '夸', '蒯', '宽', '匡', '亏', '坤', '扩', '垃', '来', '兰', '啷',
        '捞', '肋', '勒', '崚', '刕', '俩', '奁', '良', '撩', '列', '拎',
        '刢', '溜', '囖', '龙', '瞜', '噜', '娈', '畧', '抡', '罗', '呣',
        '妈', '埋', '嫚', '牤', '猫', '么', '呅', '门', '甿', '咪', '宀',
        '喵', '乜', '民', '名', '谬', '摸', '哞', '毪', '嗯', '拏', '腉',
        '囡', '囔', '孬', '疒', '娞', '恁', '能', '妮', '拈', '嬢', '鸟',
        '捏', '囜', '宁', '妞', '农', '羺', '奴', '奻', '疟', '黁', '郍',
        '喔', '讴', '妑', '拍', '眅', '乓', '抛', '呸', '喷', '匉', '丕',
        '囨', '剽', '氕', '姘', '乒', '钋', '剖', '仆', '七', '掐', '千',
        '呛', '悄', '癿', '亲', '狅', '芎', '丘', '区', '峑', '缺', '夋',
        '呥', '穣', '娆', '惹', '人', '扔', '日', '茸', '厹', '邚', '挼',
        '堧', '婑', '瞤', '捼', '仨', '毢', '三', '桒', '掻', '閪', '森',
        '僧', '杀', '筛', '山', '伤', '弰', '奢', '申', '莘', '敒', '升',
        '尸', '収', '书', '刷', '衰', '闩', '双', '谁', '吮', '说', '厶',
        '忪', '捜', '苏', '狻', '夊', '孙', '唆', '他', '囼', '坍', '汤',
        '夲', '忑', '熥', '剔', '天', '旫', '帖', '厅', '囲', '偷', '凸',
        '湍', '推', '吞', '乇', '穵', '歪', '弯', '尣', '危', '昷', '翁',
        '挝', '乌', '夕', '虲', '仚', '乡', '灱', '些', '心', '星', '凶',
        '休', '吁', '吅', '削', '坃', '丫', '恹', '央', '幺', '倻', '一',
        '囙', '应', '哟', '佣', '优', '扜', '囦', '曰', '晕', '筠', '筼',
        '帀', '災', '兂', '匨', '傮', '则', '贼', '怎', '増', '扎', '捚',
        '沾', '张', '长', '長', '佋', '蜇', '贞', '争', '之', '峙', '庢',
        '中', '州', '朱', '抓', '拽', '专', '妆', '隹', '宒', '卓', '乲',
        '宗', '邹', '租', '钻', '厜', '尊', '昨', '兙', '鿃', '鿄'
    )

    val PINYINS: Array<ByteArray> = arrayOf<ByteArray>(
        byteArrayOf(
            65 as Byte, 0 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            65 as Byte, 73 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            65 as Byte, 78 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            65 as Byte, 78 as Byte,
            71 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            65 as Byte, 79 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            66 as Byte, 65 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            66 as Byte, 65 as Byte,
            73 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            66 as Byte, 65 as Byte,
            78 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            66 as Byte, 65 as Byte,
            78 as Byte, 71 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            66 as Byte, 65 as Byte,
            79 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            66 as Byte, 69 as Byte,
            73 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            66 as Byte, 69 as Byte,
            78 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            66 as Byte, 69 as Byte,
            78 as Byte, 71 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            66 as Byte, 73 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            66 as Byte, 73 as Byte,
            65 as Byte, 78 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            66 as Byte, 73 as Byte,
            65 as Byte, 79 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            66 as Byte, 73 as Byte,
            69 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            66 as Byte, 73 as Byte,
            78 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            66 as Byte, 73 as Byte,
            78 as Byte, 71 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            66 as Byte, 79 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            66 as Byte, 85 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 65 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 65 as Byte,
            73 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 65 as Byte,
            78 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 65 as Byte,
            78 as Byte, 71 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 65 as Byte,
            79 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 69 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 69 as Byte,
            78 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 69 as Byte,
            78 as Byte, 71 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            90 as Byte, 69 as Byte,
            78 as Byte, 71 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 69 as Byte,
            78 as Byte, 71 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 72 as Byte,
            65 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 72 as Byte,
            65 as Byte, 73 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 72 as Byte,
            65 as Byte, 78 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 72 as Byte,
            65 as Byte, 78 as Byte, 71 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 72 as Byte,
            65 as Byte, 79 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 72 as Byte,
            69 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 72 as Byte,
            69 as Byte, 78 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            83 as Byte, 72 as Byte,
            69 as Byte, 78 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 72 as Byte,
            69 as Byte, 78 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 72 as Byte,
            69 as Byte, 78 as Byte, 71 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 72 as Byte,
            73 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 72 as Byte,
            79 as Byte, 78 as Byte, 71 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 72 as Byte,
            79 as Byte, 85 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 72 as Byte,
            85 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 72 as Byte,
            85 as Byte, 65 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 72 as Byte,
            85 as Byte, 65 as Byte, 73 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 72 as Byte,
            85 as Byte, 65 as Byte, 78 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 72 as Byte,
            85 as Byte, 65 as Byte, 78 as Byte, 71 as Byte
        ),
        byteArrayOf(
            67 as Byte, 72 as Byte,
            85 as Byte, 73 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 72 as Byte,
            85 as Byte, 78 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 72 as Byte,
            85 as Byte, 79 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 73 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 79 as Byte,
            78 as Byte, 71 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 79 as Byte,
            85 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 85 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 85 as Byte,
            65 as Byte, 78 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 85 as Byte,
            73 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 85 as Byte,
            78 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            67 as Byte, 85 as Byte,
            79 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            68 as Byte, 65 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            68 as Byte, 65 as Byte,
            73 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            68 as Byte, 65 as Byte,
            78 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            68 as Byte, 65 as Byte,
            78 as Byte, 71 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            68 as Byte, 65 as Byte,
            79 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            68 as Byte, 69 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            68 as Byte, 69 as Byte,
            78 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            68 as Byte, 69 as Byte,
            78 as Byte, 71 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            68 as Byte, 73 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            68 as Byte, 73 as Byte,
            65 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            68 as Byte, 73 as Byte,
            65 as Byte, 78 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            68 as Byte, 73 as Byte,
            65 as Byte, 79 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            68 as Byte, 73 as Byte,
            69 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            68 as Byte, 73 as Byte,
            78 as Byte, 71 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            68 as Byte, 73 as Byte,
            85 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            68 as Byte, 79 as Byte,
            78 as Byte, 71 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            68 as Byte, 79 as Byte,
            85 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            68 as Byte, 85 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            68 as Byte, 85 as Byte,
            65 as Byte, 78 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            68 as Byte, 85 as Byte,
            73 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            68 as Byte, 85 as Byte,
            78 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            68 as Byte, 85 as Byte,
            79 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            69 as Byte, 0 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            69 as Byte, 73 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            69 as Byte, 78 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            69 as Byte, 78 as Byte,
            71 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            69 as Byte, 82 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            70 as Byte, 65 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            70 as Byte, 65 as Byte,
            78 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            70 as Byte, 65 as Byte,
            78 as Byte, 71 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            70 as Byte, 69 as Byte,
            73 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            70 as Byte, 69 as Byte,
            78 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            70 as Byte, 69 as Byte,
            78 as Byte, 71 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            70 as Byte, 73 as Byte,
            65 as Byte, 79 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            70 as Byte, 79 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            70 as Byte, 79 as Byte,
            85 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            70 as Byte, 85 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            71 as Byte, 65 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            71 as Byte, 65 as Byte,
            73 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            71 as Byte, 65 as Byte,
            78 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            71 as Byte, 65 as Byte,
            78 as Byte, 71 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            71 as Byte, 65 as Byte,
            79 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            71 as Byte, 69 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            71 as Byte, 69 as Byte,
            73 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            71 as Byte, 69 as Byte,
            78 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            71 as Byte, 69 as Byte,
            78 as Byte, 71 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            71 as Byte, 79 as Byte,
            78 as Byte, 71 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            71 as Byte, 79 as Byte,
            85 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            71 as Byte, 85 as Byte,
            0 as Byte, 0 as Byte, 0 as Byte, 0 as Byte
        ),
        byteArrayOf(
            71 as Byte,
            85 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            71 as Byte,
            85 as Byte,
            65 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            71 as Byte,
            85 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            71 as Byte,
            85 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            71 as Byte,
            85 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            71 as Byte,
            85 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            71 as Byte,
            85 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            72 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            72 as Byte,
            65 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            72 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            72 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            72 as Byte,
            65 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            72 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            72 as Byte,
            69 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            72 as Byte,
            69 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            72 as Byte,
            69 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            72 as Byte,
            77 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            72 as Byte,
            79 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            72 as Byte,
            79 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            72 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            72 as Byte,
            85 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            72 as Byte,
            85 as Byte,
            65 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            72 as Byte,
            85 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            72 as Byte,
            85 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            72 as Byte,
            85 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            72 as Byte,
            85 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            72 as Byte,
            85 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            74 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            74 as Byte,
            73 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            74 as Byte,
            73 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            74 as Byte,
            73 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            74 as Byte,
            73 as Byte,
            65 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            74 as Byte,
            73 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            74 as Byte,
            73 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            74 as Byte,
            73 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            74 as Byte,
            73 as Byte,
            79 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            74 as Byte,
            73 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            74 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            74 as Byte,
            85 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            74 as Byte,
            85 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            74 as Byte,
            85 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            75 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            75 as Byte,
            65 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            75 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            75 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            75 as Byte,
            65 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            75 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            75 as Byte,
            69 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            75 as Byte,
            69 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            75 as Byte,
            79 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            75 as Byte,
            79 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            75 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            75 as Byte,
            85 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            75 as Byte,
            85 as Byte,
            65 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            75 as Byte,
            85 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            75 as Byte,
            85 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            75 as Byte,
            85 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            75 as Byte,
            85 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            75 as Byte,
            85 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            65 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            65 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            69 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            69 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            73 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            73 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            73 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            73 as Byte,
            65 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            73 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            73 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            73 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            73 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            79 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            79 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            85 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            85 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            85 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            76 as Byte,
            85 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            77 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            77 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            77 as Byte,
            65 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            77 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            77 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            77 as Byte,
            65 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            77 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            77 as Byte,
            69 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            77 as Byte,
            69 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            77 as Byte,
            69 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            77 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            77 as Byte,
            73 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            77 as Byte,
            73 as Byte,
            65 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            77 as Byte,
            73 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            77 as Byte,
            73 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            77 as Byte,
            73 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            77 as Byte,
            73 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            77 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            77 as Byte,
            79 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            77 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            65 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            65 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            69 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            69 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            69 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            73 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            73 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            73 as Byte,
            65 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            73 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            73 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            73 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            73 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            79 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            79 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            85 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            85 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            85 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            78 as Byte,
            85 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            79 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            80 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            80 as Byte,
            65 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            80 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            80 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            80 as Byte,
            65 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            80 as Byte,
            69 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            80 as Byte,
            69 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            80 as Byte,
            69 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            80 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            80 as Byte,
            73 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            80 as Byte,
            73 as Byte,
            65 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            80 as Byte,
            73 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            80 as Byte,
            73 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            80 as Byte,
            73 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            80 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            80 as Byte,
            79 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            80 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            81 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            81 as Byte,
            73 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            81 as Byte,
            73 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            81 as Byte,
            73 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            81 as Byte,
            73 as Byte,
            65 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            81 as Byte,
            73 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            81 as Byte,
            73 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            81 as Byte,
            73 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            81 as Byte,
            73 as Byte,
            79 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            81 as Byte,
            73 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            81 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            81 as Byte,
            85 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            81 as Byte,
            85 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            81 as Byte,
            85 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            82 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            82 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            82 as Byte,
            65 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            82 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            82 as Byte,
            69 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            82 as Byte,
            69 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            82 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            82 as Byte,
            79 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            82 as Byte,
            79 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            82 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            82 as Byte,
            85 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            82 as Byte,
            85 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            82 as Byte,
            85 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            82 as Byte,
            85 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            82 as Byte,
            85 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            65 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            65 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            69 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            69 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            72 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            72 as Byte,
            65 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            72 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            72 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            72 as Byte,
            65 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            72 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            72 as Byte,
            69 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            88 as Byte,
            73 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            72 as Byte,
            69 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            72 as Byte,
            69 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            72 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            72 as Byte,
            79 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            72 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            72 as Byte,
            85 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            72 as Byte,
            85 as Byte,
            65 as Byte,
            73 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            72 as Byte,
            85 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            72 as Byte,
            85 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            72 as Byte,
            85 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            72 as Byte,
            85 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            72 as Byte,
            85 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            79 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            79 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            85 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            85 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            85 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            85 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            84 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            84 as Byte,
            65 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            84 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            84 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            84 as Byte,
            65 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            84 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            84 as Byte,
            69 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            84 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            84 as Byte,
            73 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            84 as Byte,
            73 as Byte,
            65 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            84 as Byte,
            73 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            84 as Byte,
            73 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            84 as Byte,
            79 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            84 as Byte,
            79 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            84 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            84 as Byte,
            85 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            84 as Byte,
            85 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            84 as Byte,
            85 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            84 as Byte,
            85 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            87 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            87 as Byte,
            65 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            87 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            87 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            87 as Byte,
            69 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            87 as Byte,
            69 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            87 as Byte,
            69 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            87 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            87 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            88 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            88 as Byte,
            73 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            88 as Byte,
            73 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            88 as Byte,
            73 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            88 as Byte,
            73 as Byte,
            65 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            88 as Byte,
            73 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            88 as Byte,
            73 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            88 as Byte,
            73 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            88 as Byte,
            73 as Byte,
            79 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            88 as Byte,
            73 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            88 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            88 as Byte,
            85 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            88 as Byte,
            85 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            88 as Byte,
            85 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            89 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            89 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            89 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            89 as Byte,
            65 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            89 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            89 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            89 as Byte,
            73 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            89 as Byte,
            73 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            89 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            89 as Byte,
            79 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            89 as Byte,
            79 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            89 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            89 as Byte,
            85 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            89 as Byte,
            85 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            89 as Byte,
            85 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            74 as Byte,
            85 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            89 as Byte,
            85 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            65 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            65 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            69 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            69 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            69 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            72 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            72 as Byte,
            65 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            72 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            72 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            67 as Byte,
            72 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            72 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            72 as Byte,
            65 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            72 as Byte,
            69 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            72 as Byte,
            69 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            72 as Byte,
            69 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            72 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            83 as Byte,
            72 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            72 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            72 as Byte,
            79 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            72 as Byte,
            79 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            72 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            72 as Byte,
            85 as Byte,
            65 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            72 as Byte,
            85 as Byte,
            65 as Byte,
            73 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            72 as Byte,
            85 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            72 as Byte,
            85 as Byte,
            65 as Byte,
            78 as Byte,
            71 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            72 as Byte,
            85 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            72 as Byte,
            85 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            72 as Byte,
            85 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            79 as Byte,
            78 as Byte,
            71 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            79 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            85 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            85 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            85 as Byte,
            73 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            85 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        byteArrayOf(
            90 as Byte,
            85 as Byte,
            79 as Byte,
            0 as Byte,
            0 as Byte,
            0 as Byte
        ),
        ByteArray(6),
        byteArrayOf(
            83 as Byte,
            72 as Byte,
            65 as Byte,
            78 as Byte,
            0 as Byte,
            0 as Byte
        ),
        ByteArray(6)
    )

}