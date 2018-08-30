什么是 Markdown

最近因为大量码字，开始接触 Markdown 写作。Markdown 是一种方便记忆和书写的纯文本标记语言。用户可以使用这些标记符号以最小的输入代价生成极富表现力的文档，兼顾了可读性和易用性。其优点包括：

纯文本写作，兼容性极强，可以用所有文本编辑器打开。
让写作者专注于文字而不是排版。
格式转换方便，Markdown 的文本可以轻松转换为 html、电子书等。
Markdown 的标记语法有极好的可读性。
<small>引自：http://www.jianshu.com/p/q81RER
要开始 Markdown 的写作，首先要找到一款适合自己的 Markdown 编辑器工具。下面三篇文章详细介绍了各个平台（Win，Mac，iOS，Android）上优秀的 Markdown 编辑器，可以根据自己的喜好和经济能力选择一个或几个：

码字必备：18 款优秀的 Markdown 写作工具 | 2015 年度盘点
解决作者们的焦虑：7 款优秀 Markdown 编辑工具推荐
Markdown 编辑器推荐
在线（网页）编辑器个人选择了简书，界面简洁，同时支持 Markdown 和富文本编辑，能够让人专注于写作。而且在其分享平台上还能发现很多个人原创的优秀作品。简书还有 iOS 和 Android 客户端。不足之处在于，他家的 iOS 客户端在 iPad 上的使用体验很不好，无法横屏浏览。

Windows 上的客户端强烈推荐 Typora，免费，而且 UI 不错。另外，MarkdownPad 2 作为老牌的编辑器也不错。虽然专业版需要付费，但是可以在网上轻易找到注册码，就能享受专业版的全部功能了。但貌似它并不支持流程图和 LateX 公式的编译（Typora，马克飞象，Cmd Markdown 都可以支持），最终被我弃用了。

iPad 上装的日记app Day One 2 因为支持 Markdown，所以也顺便测试了一下。顺带一提，知名app——锤子便签也是支持 Markdown 的。( ╯▽╰)

经过在简书、Typora 和 Day One 2 上大半天的倒腾，最终总结一份 Markdown 语法的小指南，方便自己平时查阅，也可以当做给身边想接触 Markdown 的小伙伴的入门学习材料。尽管三者对 Markdown 语法的支持稍有区别，但基本语法都是适用的。

1. 分级标题（Headers）

在文本前面加上#即可。次级标题只需要增加 # 即可，标题字号相应降低，总共6级。（注：#和标题之间建议保留一个字符的空格，这是最标准的 Markdown 写法。）

# Header 1
## Header 2
### Header 3
#### Header 4
##### Header 5
###### Header 6
Header 1

Header 2

Header 3

Header 4

Header 5

Header 6

也可使用===表示一级标题，使用---表示二级标题。

Header 1
===

Header 2
---
Header 1

Header 2

2. 文字样式（Text Styling）

2.1. 基本语法

*Italics* or _Italics_ 
**Bold** or __Bold__ 
***Bold Italics*** or ___Bold Italics___ 
~~Delete~~
Italics or Italics
Bold or Bold
Bold Italics or Bold Italics
Delete

2.2. 非基本语法

字体上标（superscript）和下标（subscript ）

简书中，字体上、下标的语法为：

<sup>上标文字</sup>
<sub>下标文字</sub>
这是上标文字
这是下标文字

Typora 中，字体上、下标的语法为：

^上标文字^
~下标文字~
字体大小设置

简书中，可以通过 <> 调整：

<sup>上标文字</sup>
<sub>下标文字</sub>
这是上标文字
这是下标文字

下划线

简书和 Typora 都支持字体下划线：

<u>Underline</u>
<u>Underline</u>

字体背景高亮

Typora 中支持字体背景高亮（简书不支持）：
==Highlight==
3. 列表（Lists）

3.1. 有序列表（Ordered Lists）

数字不能省略但可无序，点号之后的空格不能少。建立多级列表时，每个子级别都要比上个级别前面多打2个以上空格。

1. Item-1
 1.1. Item-1-1
    1.1.1. Item-1-1-1
      1.1.1.1. Item-1-1-1-1
  1.2. Item-1-2
2. Item-2
6. Item-3
Item-1
1.1. Item-1-1
1.1.1. Item-1-1-1
1.1.1.1. Item-1-1-1-1
1.2. Item-1-2
Item-2
Item-3
3.2. 无序列表（Unordered Lists）

符号之后的空格不能少，-、+、*效果一样，在嵌套列表中可以循环使用。

- Item-1
  - Item-1-1
    + Item-1-1-1
      * Item-1-1-1-1
  * Item-1-2
+ Item-2
* Item-3
Item-1
Item-1-1
Item-1-1-1
Item-1-1-1-1
Item-1-2
Item-2
Item-3
注：列表项里面可能包含多个段落，后面的段落必须用4个空格或1个制表符缩进。

- Item-1
   - Item-1-1
      Item-1-1 (continued...)
      Item-1-1 (continued...)
  - Item-1-2
-   Item-2
Item-1
Item-1-1
Item-1-1 (continued...)
Item-1-1 (continued...)
Item-1-2
Item-2
4. 添加链接（Links）

Markdown支持两种风格的链接：内联（Inline）和引用（Reference）。

4.1. 内联（Inline）

内联（Inline）：以中括号[]标记显示的链接文本，后面紧跟用小括号()包围的链接。如果链接 Title 属性，则在链接中使用空格加"Title 属性"，即[Title](URL "Title")。

This is [an example](http://example.com/ "Title") inline link.
[This link](http://example.net/) has no title attribute.
This is an example inline link.
This link has no title attribute.

4.2. 引用（Reference）

引用（Reference）：一般应用于多个不同位置使用相同链接。通常分为两个部分：

调用部分格式为：[链接文本][ref]

*注：两个中括号之间可以有空格。

定义部分可以出现在文本中的其他位置，格式为：[ref]: http://some/link/address (可选的标题)。

注：ref 中不区分大小写。

This is [an example][ref] reference-style link.
[ref]: http://example.com/ "Optional Title Here"
This is [an example][ref] reference-style link.
[ref]: http://example.com/ "Optional Title Here"

*Ref: *http://markdown-zh.readthedocs.io/en/latest/spanelements/
4.3. 自动创建链接

使用尖括号<>，可以为输入的URL或者邮箱自动创建链接，如test@domain.com。

<test@domain.com>
test@domain.com

5. 添加图片（Images）

添加图片的使用方法基本上和链接类似，只是在中括号前加叹号!，即![Image Title](URL "Image Title")。

![GitHub Mark](http://github.global.ssl.fastly.net/images/modules/logos_page/GitHub-Mark.png "GitHub Mark")

GitHub Mark
注：Markdown 不能设置图片大小，如果必须设置则应使用HTML标记 <img>。

6. 文字引用（Blockquotes）

使用>表示文字引用。可以多级引用。

> Quote 1
> > Quote 2
> > > Quote 3
Quote 1

Quote 2

Quote 3
想在列表项里面使用区块引用，定界符>必须得缩进：

* Item
  > Quote 1
  > Quote 2
Item
Quote 1
Quote 2
7. 转义字符（Backslash Escapes）

Markdown 可以利用反斜杠\来插入一些在语法中有其它意义的符号，例如：如果想要用星号加在文字旁边的方式来做出强调效果，可以在星号的前面加上反斜杠：

\*literal asterisks\*
*literal asterisks*

Markdown 支持在下面这些符号前面加上反斜杠来帮助插入普通的符号：

符号	英文名称	中文名称
\	backslash	反斜杠
`	backtick	反引号
*	asterisk	星号
_	underscore	下划线
{}	curly braces	大括号
[]	square brackets	中括号
()	parentheses	小括号
#	hash mark	井号
+	plus sign	加号
-	minus sign (hyphen)	减号
.	dot	英文句号
!	exclamation mark	感叹号
8. 代码块引用（Fenced Code Blocks）

插入代码块的方式有两种：

在每行代码前加入4个空格或者添加一个制表符（TAB键）
使用反引号 `。
需要引用代码时，如果引用的语句只有一段，不分行，可以用 ` 将语句包起来。

`Hello world`
Hello world

如果引用的语句为多行，可以将 ``` 置于这段代码的首行和末行。

​```
Code Line 1
Code Line 2
Code Line 3
​```
Code Line 1
Code Line 2
Code Line 3
注：代码缩进请使用四个空格，不要使用 Tab。

9. 表格（Tables）

代码示例：

| Tables | Are | Cool  |
| ------ |:---:| -----:|
| col 3 is | right-aligned | $1600 |
| col 2 is | centered | $12 |
| zebra stripes | are neat | $1 |
显示效果：

Tables	Are	Cool
col 3 is	right-aligned	$1600
col 2 is	centered	$12
zebra stripes	are neat	$1
语法说明：

|、-、:之间的多余空格会被忽略，不影响布局。
默认标题栏居中对齐，内容居左对齐。
-:表示内容和标题栏居右对齐，:-表示内容和标题栏居左对齐，:-:表示内容和标题栏居中对齐。
内容和|之间的多余空格会被忽略，每行第一个|和最后一个|可以省略，-的数量至少有一个。
*Ref: *http://www.jianshu.com/p/q81RER
10. 分隔线

在一行中使用三个或三个以上的*、-或_可以添加分隔线，中间插入空格，但是不能有其他字符。下面每种写法都可以建立分隔线：

* * *

***

*****

- - -

------

11. 添加脚注（Footnotes）

脚注是在需要标记脚注文字的后面增加一个方括号，方括号中的内容必须以 ^ 开头，再接着是数字、字符串标记：

Footnotes[^1] have a label[^label] and a definition[^!DEF].
接着，在文件的任意地方，可以把这个脚注的内容定义出来。脚注内容定义的形式就是前面引用脚注的内容，接着一个冒号，再接着一个以上的空格或制表符，最后是脚注定义的内容：

[^1]: This is a footnote
[^label]: A footnote on "label"
[^!DEF]: The definition of a footnote.
Footnotes[1] have a label[2] and a definition[3].

脚注定义的内容可以包含多行、段落、代码区块、区块引用和大多数其他 markdown 格式的内容。对于多行的内容只需要简单缩进至少4个空格。

[^1]: The first paragraph of the definition.

        Paragraph two of the definition.

        > A blockquote with
        > multiple lines.

                a code block

        A final paragraph.
默认情况下，脚注内容位于生成的 HTML 文档末尾。

*Ref: *http://microjo.github.io/2012/markdown_ext.html
12. 目录（Table of Contents）

在需要目录出现的地方放置一个标记，这样会自动生成一个嵌套的包含所有标题的列表。默认的标记是 [TOC]。

[TOC]
[TOC]

注：简书不支持该语法，Typora、马克飞象、Cmd Markdown等编辑器支持。

*Ref: *http://microjo.github.io/2012/markdown_ext.html
13. 任务列表

- [x] [links](), **formatting**, and ~~tags~~ supported
- [x] list syntax required (any unordered or ordered list supported)
- [x] this is a complete item
- [ ] this is an incomplete item
[x] links, formatting, and tags supported
[x] list syntax required (any unordered or ordered list supported)
[x] this is a complete item
[ ] this is an incomplete item
*Ref: *https://enterprise.github.com/downloads/en/markdown-cheatsheet.pdf
注：简书不支持该语法，Typora、Day One 2、马克飞象、Cmd Markdown等编辑器支持。

一些Markdown写作的好习惯

英文字母与中文之间需要两边空格（英文与符号之间不空格）
高亮英文之间需要两边空格
代码符号 ``` 上面需要空一行，结束 ``` 下面需要空一行
中文之间和短英文之间使用中文标点
一篇文章中只能出现一个 # 号标题