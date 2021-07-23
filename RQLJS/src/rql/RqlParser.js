// Generated from RqlParser.g4 by ANTLR 4.9.2
// jshint ignore: start
import antlr4 from 'antlr4';
import RqlParserListener from './RqlParserListener.js';

const serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786",
    "\u5964\u0003D\u0157\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004",
    "\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007",
    "\u0004\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f",
    "\u0004\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010\t\u0010",
    "\u0004\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013\u0004\u0014",
    "\t\u0014\u0004\u0015\t\u0015\u0004\u0016\t\u0016\u0004\u0017\t\u0017",
    "\u0003\u0002\u0007\u00020\n\u0002\f\u0002\u000e\u00023\u000b\u0002\u0003",
    "\u0002\u0003\u0002\u0005\u00027\n\u0002\u0003\u0002\u0005\u0002:\n\u0002",
    "\u0003\u0002\u0005\u0002=\n\u0002\u0003\u0002\u0005\u0002@\n\u0002\u0003",
    "\u0002\u0005\u0002C\n\u0002\u0003\u0002\u0005\u0002F\n\u0002\u0003\u0002",
    "\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003M\n\u0003",
    "\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003S\n\u0003",
    "\u0003\u0003\u0003\u0003\u0005\u0003W\n\u0003\u0003\u0004\u0003\u0004",
    "\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006",
    "\u0005\u0006a\n\u0006\u0003\u0006\u0003\u0006\u0005\u0006e\n\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0005\u0006j\n\u0006\u0007\u0006l\n\u0006",
    "\f\u0006\u000e\u0006o\u000b\u0006\u0003\u0006\u0003\u0006\u0005\u0006",
    "s\n\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007",
    "\u0003\u0007\u0007\u0007{\n\u0007\f\u0007\u000e\u0007~\u000b\u0007\u0003",
    "\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\b\u0003\b\u0003\b\u0003",
    "\b\u0003\b\u0007\b\u0089\n\b\f\b\u000e\b\u008c\u000b\b\u0005\b\u008e",
    "\n\b\u0003\t\u0003\t\u0003\t\u0003\n\u0003\n\u0003\n\u0005\n\u0096\n",
    "\n\u0003\n\u0005\n\u0099\n\n\u0003\n\u0003\n\u0003\u000b\u0003\u000b",
    "\u0003\u000b\u0003\u000b\u0003\u000b\u0006\u000b\u00a2\n\u000b\r\u000b",
    "\u000e\u000b\u00a3\u0003\u000b\u0005\u000b\u00a7\n\u000b\u0003\u000b",
    "\u0003\u000b\u0003\u000b\u0003\u000b\u0006\u000b\u00ad\n\u000b\r\u000b",
    "\u000e\u000b\u00ae\u0003\u000b\u0005\u000b\u00b2\n\u000b\u0007\u000b",
    "\u00b4\n\u000b\f\u000b\u000e\u000b\u00b7\u000b\u000b\u0005\u000b\u00b9",
    "\n\u000b\u0003\u000b\u0003\u000b\u0003\f\u0003\f\u0003\f\u0003\r\u0003",
    "\r\u0003\r\u0003\r\u0007\r\u00c4\n\r\f\r\u000e\r\u00c7\u000b\r\u0003",
    "\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0007\u000e\u00cd\n\u000e",
    "\f\u000e\u000e\u000e\u00d0\u000b\u000e\u0003\u000e\u0005\u000e\u00d3",
    "\n\u000e\u0003\u000e\u0005\u000e\u00d6\n\u000e\u0003\u000f\u0003\u000f",
    "\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010",
    "\u0003\u0010\u0003\u0010\u0005\u0010\u00e2\n\u0010\u0003\u0010\u0006",
    "\u0010\u00e5\n\u0010\r\u0010\u000e\u0010\u00e6\u0003\u0010\u0005\u0010",
    "\u00ea\n\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0005",
    "\u0010\u00f0\n\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010",
    "\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010",
    "\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0005\u0010",
    "\u0101\n\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0005",
    "\u0010\u0107\n\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0005\u0010",
    "\u010c\n\u0010\u0003\u0010\u0003\u0010\u0007\u0010\u0110\n\u0010\f\u0010",
    "\u000e\u0010\u0113\u000b\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003",
    "\u0011\u0003\u0011\u0007\u0011\u011a\n\u0011\f\u0011\u000e\u0011\u011d",
    "\u000b\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0012",
    "\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012",
    "\u0006\u0012\u012a\n\u0012\r\u0012\u000e\u0012\u012b\u0003\u0012\u0005",
    "\u0012\u012f\n\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012",
    "\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012",
    "\u0003\u0012\u0003\u0012\u0007\u0012\u013d\n\u0012\f\u0012\u000e\u0012",
    "\u0140\u000b\u0012\u0003\u0013\u0003\u0013\u0005\u0013\u0144\n\u0013",
    "\u0003\u0013\u0005\u0013\u0147\n\u0013\u0003\u0014\u0003\u0014\u0005",
    "\u0014\u014b\n\u0014\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016",
    "\u0003\u0016\u0003\u0017\u0005\u0017\u0153\n\u0017\u0003\u0017\u0003",
    "\u0017\u0003\u0017\u0003\u008a\u0004\u001e\"\u0018\u0002\u0004\u0006",
    "\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*",
    ",\u0002\u0006\u0006\u0002\u001f\u001f%%11::\u0004\u0002((;;\u0007\u0002",
    "&\'))//33>?\u0003\u0002BC\u0002\u0184\u00021\u0003\u0002\u0002\u0002",
    "\u0004V\u0003\u0002\u0002\u0002\u0006X\u0003\u0002\u0002\u0002\bZ\u0003",
    "\u0002\u0002\u0002\nr\u0003\u0002\u0002\u0002\ft\u0003\u0002\u0002\u0002",
    "\u000e\u008d\u0003\u0002\u0002\u0002\u0010\u008f\u0003\u0002\u0002\u0002",
    "\u0012\u0098\u0003\u0002\u0002\u0002\u0014\u009c\u0003\u0002\u0002\u0002",
    "\u0016\u00bc\u0003\u0002\u0002\u0002\u0018\u00bf\u0003\u0002\u0002\u0002",
    "\u001a\u00c8\u0003\u0002\u0002\u0002\u001c\u00d7\u0003\u0002\u0002\u0002",
    "\u001e\u00ef\u0003\u0002\u0002\u0002 \u0114\u0003\u0002\u0002\u0002",
    "\"\u012e\u0003\u0002\u0002\u0002$\u0143\u0003\u0002\u0002\u0002&\u014a",
    "\u0003\u0002\u0002\u0002(\u014c\u0003\u0002\u0002\u0002*\u014e\u0003",
    "\u0002\u0002\u0002,\u0152\u0003\u0002\u0002\u0002.0\u0005\f\u0007\u0002",
    "/.\u0003\u0002\u0002\u000203\u0003\u0002\u0002\u00021/\u0003\u0002\u0002",
    "\u000212\u0003\u0002\u0002\u000224\u0003\u0002\u0002\u000231\u0003\u0002",
    "\u0002\u000246\u0005\u0004\u0003\u000257\u0005\b\u0005\u000265\u0003",
    "\u0002\u0002\u000267\u0003\u0002\u0002\u000279\u0003\u0002\u0002\u0002",
    "8:\u0005\u0016\f\u000298\u0003\u0002\u0002\u00029:\u0003\u0002\u0002",
    "\u0002:<\u0003\u0002\u0002\u0002;=\u0005\u0018\r\u0002<;\u0003\u0002",
    "\u0002\u0002<=\u0003\u0002\u0002\u0002=?\u0003\u0002\u0002\u0002>@\u0005",
    "\u001a\u000e\u0002?>\u0003\u0002\u0002\u0002?@\u0003\u0002\u0002\u0002",
    "@B\u0003\u0002\u0002\u0002AC\u0005*\u0016\u0002BA\u0003\u0002\u0002",
    "\u0002BC\u0003\u0002\u0002\u0002CE\u0003\u0002\u0002\u0002DF\u0005\n",
    "\u0006\u0002ED\u0003\u0002\u0002\u0002EF\u0003\u0002\u0002\u0002FG\u0003",
    "\u0002\u0002\u0002GH\u0007\u0002\u0002\u0003H\u0003\u0003\u0002\u0002",
    "\u0002IJ\u0007*\u0002\u0002JL\u0005(\u0015\u0002KM\u0005,\u0017\u0002",
    "LK\u0003\u0002\u0002\u0002LM\u0003\u0002\u0002\u0002MW\u0003\u0002\u0002",
    "\u0002NO\u0007*\u0002\u0002OP\u0007.\u0002\u0002PR\u0005\u0006\u0004",
    "\u0002QS\u0005,\u0017\u0002RQ\u0003\u0002\u0002\u0002RS\u0003\u0002",
    "\u0002\u0002SW\u0003\u0002\u0002\u0002TU\u0007*\u0002\u0002UW\u0007",
    "\u001e\u0002\u0002VI\u0003\u0002\u0002\u0002VN\u0003\u0002\u0002\u0002",
    "VT\u0003\u0002\u0002\u0002W\u0005\u0003\u0002\u0002\u0002XY\u0007B\u0002",
    "\u0002Y\u0007\u0003\u0002\u0002\u0002Z[\u00070\u0002\u0002[\\\u0005",
    "\u0012\n\u0002\\]\u0005\u0010\t\u0002]\t\u0003\u0002\u0002\u0002^`\u0007",
    "8\u0002\u0002_a\u0007$\u0002\u0002`_\u0003\u0002\u0002\u0002`a\u0003",
    "\u0002\u0002\u0002ad\u0003\u0002\u0002\u0002be\u0005$\u0013\u0002ce",
    "\u0005 \u0011\u0002db\u0003\u0002\u0002\u0002dc\u0003\u0002\u0002\u0002",
    "em\u0003\u0002\u0002\u0002fi\u0007\u0006\u0002\u0002gj\u0005$\u0013",
    "\u0002hj\u0005 \u0011\u0002ig\u0003\u0002\u0002\u0002ih\u0003\u0002",
    "\u0002\u0002jl\u0003\u0002\u0002\u0002kf\u0003\u0002\u0002\u0002lo\u0003",
    "\u0002\u0002\u0002mk\u0003\u0002\u0002\u0002mn\u0003\u0002\u0002\u0002",
    "ns\u0003\u0002\u0002\u0002om\u0003\u0002\u0002\u0002pq\u00078\u0002",
    "\u0002qs\u0005\u000e\b\u0002r^\u0003\u0002\u0002\u0002rp\u0003\u0002",
    "\u0002\u0002s\u000b\u0003\u0002\u0002\u0002tu\u0007@\u0002\u0002uv\u0007",
    "C\u0002\u0002vw\u0007\f\u0002\u0002w|\u0007C\u0002\u0002xy\u0007\u0006",
    "\u0002\u0002y{\u0007C\u0002\u0002zx\u0003\u0002\u0002\u0002{~\u0003",
    "\u0002\u0002\u0002|z\u0003\u0002\u0002\u0002|}\u0003\u0002\u0002\u0002",
    "}\u007f\u0003\u0002\u0002\u0002~|\u0003\u0002\u0002\u0002\u007f\u0080",
    "\u0007\u0004\u0002\u0002\u0080\u0081\u0003\u0002\u0002\u0002\u0081\u0082",
    "\u0005\u000e\b\u0002\u0082\r\u0003\u0002\u0002\u0002\u0083\u0084\u0007",
    "\u000b\u0002\u0002\u0084\u0085\u0005\u000e\b\u0002\u0085\u0086\u0007",
    "\u0003\u0002\u0002\u0086\u008e\u0003\u0002\u0002\u0002\u0087\u0089\u000b",
    "\u0002\u0002\u0002\u0088\u0087\u0003\u0002\u0002\u0002\u0089\u008c\u0003",
    "\u0002\u0002\u0002\u008a\u008b\u0003\u0002\u0002\u0002\u008a\u0088\u0003",
    "\u0002\u0002\u0002\u008b\u008e\u0003\u0002\u0002\u0002\u008c\u008a\u0003",
    "\u0002\u0002\u0002\u008d\u0083\u0003\u0002\u0002\u0002\u008d\u008a\u0003",
    "\u0002\u0002\u0002\u008e\u000f\u0003\u0002\u0002\u0002\u008f\u0090\u0007",
    "!\u0002\u0002\u0090\u0091\u0007C\u0002\u0002\u0091\u0011\u0003\u0002",
    "\u0002\u0002\u0092\u0095\u0007C\u0002\u0002\u0093\u0094\u0007\r\u0002",
    "\u0002\u0094\u0096\u0007\u0005\u0002\u0002\u0095\u0093\u0003\u0002\u0002",
    "\u0002\u0095\u0096\u0003\u0002\u0002\u0002\u0096\u0097\u0003\u0002\u0002",
    "\u0002\u0097\u0099\u0007\u0007\u0002\u0002\u0098\u0092\u0003\u0002\u0002",
    "\u0002\u0098\u0099\u0003\u0002\u0002\u0002\u0099\u009a\u0003\u0002\u0002",
    "\u0002\u009a\u009b\u0007C\u0002\u0002\u009b\u0013\u0003\u0002\u0002",
    "\u0002\u009c\u009d\u0005\u0012\n\u0002\u009d\u00b8\u0007\f\u0002\u0002",
    "\u009e\u00a7\u0005\u0014\u000b\u0002\u009f\u00a7\u0005\u0012\n\u0002",
    "\u00a0\u00a2\u0007B\u0002\u0002\u00a1\u00a0\u0003\u0002\u0002\u0002",
    "\u00a2\u00a3\u0003\u0002\u0002\u0002\u00a3\u00a1\u0003\u0002\u0002\u0002",
    "\u00a3\u00a4\u0003\u0002\u0002\u0002\u00a4\u00a7\u0003\u0002\u0002\u0002",
    "\u00a5\u00a7\u0007A\u0002\u0002\u00a6\u009e\u0003\u0002\u0002\u0002",
    "\u00a6\u009f\u0003\u0002\u0002\u0002\u00a6\u00a1\u0003\u0002\u0002\u0002",
    "\u00a6\u00a5\u0003\u0002\u0002\u0002\u00a7\u00b5\u0003\u0002\u0002\u0002",
    "\u00a8\u00b1\u0007\u0006\u0002\u0002\u00a9\u00b2\u0005\u0014\u000b\u0002",
    "\u00aa\u00b2\u0005\u0012\n\u0002\u00ab\u00ad\u0007B\u0002\u0002\u00ac",
    "\u00ab\u0003\u0002\u0002\u0002\u00ad\u00ae\u0003\u0002\u0002\u0002\u00ae",
    "\u00ac\u0003\u0002\u0002\u0002\u00ae\u00af\u0003\u0002\u0002\u0002\u00af",
    "\u00b2\u0003\u0002\u0002\u0002\u00b0\u00b2\u0007A\u0002\u0002\u00b1",
    "\u00a9\u0003\u0002\u0002\u0002\u00b1\u00aa\u0003\u0002\u0002\u0002\u00b1",
    "\u00ac\u0003\u0002\u0002\u0002\u00b1\u00b0\u0003\u0002\u0002\u0002\u00b2",
    "\u00b4\u0003\u0002\u0002\u0002\u00b3\u00a8\u0003\u0002\u0002\u0002\u00b4",
    "\u00b7\u0003\u0002\u0002\u0002\u00b5\u00b3\u0003\u0002\u0002\u0002\u00b5",
    "\u00b6\u0003\u0002\u0002\u0002\u00b6\u00b9\u0003\u0002\u0002\u0002\u00b7",
    "\u00b5\u0003\u0002\u0002\u0002\u00b8\u00a6\u0003\u0002\u0002\u0002\u00b8",
    "\u00b9\u0003\u0002\u0002\u0002\u00b9\u00ba\u0003\u0002\u0002\u0002\u00ba",
    "\u00bb\u0007\u0004\u0002\u0002\u00bb\u0015\u0003\u0002\u0002\u0002\u00bc",
    "\u00bd\u0007<\u0002\u0002\u00bd\u00be\u0005\u001e\u0010\u0002\u00be",
    "\u0017\u0003\u0002\u0002\u0002\u00bf\u00c0\u0007+\u0002\u0002\u00c0",
    "\u00c5\u0005$\u0013\u0002\u00c1\u00c2\u0007\u0006\u0002\u0002\u00c2",
    "\u00c4\u0005$\u0013\u0002\u00c3\u00c1\u0003\u0002\u0002\u0002\u00c4",
    "\u00c7\u0003\u0002\u0002\u0002\u00c5\u00c3\u0003\u0002\u0002\u0002\u00c5",
    "\u00c6\u0003\u0002\u0002\u0002\u00c6\u0019\u0003\u0002\u0002\u0002\u00c7",
    "\u00c5\u0003\u0002\u0002\u0002\u00c8\u00c9\u00077\u0002\u0002\u00c9",
    "\u00ce\u0005$\u0013\u0002\u00ca\u00cb\u0007\u0006\u0002\u0002\u00cb",
    "\u00cd\u0005$\u0013\u0002\u00cc\u00ca\u0003\u0002\u0002\u0002\u00cd",
    "\u00d0\u0003\u0002\u0002\u0002\u00ce\u00cc\u0003\u0002\u0002\u0002\u00ce",
    "\u00cf\u0003\u0002\u0002\u0002\u00cf\u00d2\u0003\u0002\u0002\u0002\u00d0",
    "\u00ce\u0003\u0002\u0002\u0002\u00d1\u00d3\u0005\u001c\u000f\u0002\u00d2",
    "\u00d1\u0003\u0002\u0002\u0002\u00d2\u00d3\u0003\u0002\u0002\u0002\u00d3",
    "\u00d5\u0003\u0002\u0002\u0002\u00d4\u00d6\u00079\u0002\u0002\u00d5",
    "\u00d4\u0003\u0002\u0002\u0002\u00d5\u00d6\u0003\u0002\u0002\u0002\u00d6",
    "\u001b\u0003\u0002\u0002\u0002\u00d7\u00d8\u0007!\u0002\u0002\u00d8",
    "\u00d9\t\u0002\u0002\u0002\u00d9\u001d\u0003\u0002\u0002\u0002\u00da",
    "\u00db\b\u0010\u0001\u0002\u00db\u00f0\u0005 \u0011\u0002\u00dc\u00dd",
    "\u0007\f\u0002\u0002\u00dd\u00de\u0005\u001e\u0010\u0002\u00de\u00df",
    "\u0007\u0004\u0002\u0002\u00df\u00f0\u0003\u0002\u0002\u0002\u00e0\u00e2",
    "\u0007\u0006\u0002\u0002\u00e1\u00e0\u0003\u0002\u0002\u0002\u00e1\u00e2",
    "\u0003\u0002\u0002\u0002\u00e2\u00e4\u0003\u0002\u0002\u0002\u00e3\u00e5",
    "\u0007B\u0002\u0002\u00e4\u00e3\u0003\u0002\u0002\u0002\u00e5\u00e6",
    "\u0003\u0002\u0002\u0002\u00e6\u00e4\u0003\u0002\u0002\u0002\u00e6\u00e7",
    "\u0003\u0002\u0002\u0002\u00e7\u00e9\u0003\u0002\u0002\u0002\u00e8\u00ea",
    "\u0005\u001e\u0010\u0002\u00e9\u00e8\u0003\u0002\u0002\u0002\u00e9\u00ea",
    "\u0003\u0002\u0002\u0002\u00ea\u00f0\u0003\u0002\u0002\u0002\u00eb\u00f0",
    "\u0007A\u0002\u0002\u00ec\u00f0\t\u0003\u0002\u0002\u00ed\u00f0\u0005",
    "\u0014\u000b\u0002\u00ee\u00f0\u0005\u0012\n\u0002\u00ef\u00da\u0003",
    "\u0002\u0002\u0002\u00ef\u00dc\u0003\u0002\u0002\u0002\u00ef\u00e1\u0003",
    "\u0002\u0002\u0002\u00ef\u00eb\u0003\u0002\u0002\u0002\u00ef\u00ec\u0003",
    "\u0002\u0002\u0002\u00ef\u00ed\u0003\u0002\u0002\u0002\u00ef\u00ee\u0003",
    "\u0002\u0002\u0002\u00f0\u0111\u0003\u0002\u0002\u0002\u00f1\u00f2\f",
    "\r\u0002\u0002\u00f2\u00f3\u0007\t\u0002\u0002\u00f3\u0110\u0005\u001e",
    "\u0010\u000e\u00f4\u00f5\f\f\u0002\u0002\u00f5\u00f6\u0007\n\u0002\u0002",
    "\u00f6\u0110\u0005\u001e\u0010\r\u00f7\u00f8\f\u000b\u0002\u0002\u00f8",
    "\u00f9\u0007\"\u0002\u0002\u00f9\u00fa\u0005\u001e\u0010\u0002\u00fa",
    "\u00fb\u0007 \u0002\u0002\u00fb\u00fc\u0005\u001e\u0010\f\u00fc\u0110",
    "\u0003\u0002\u0002\u0002\u00fd\u00fe\f\n\u0002\u0002\u00fe\u0100\u0007",
    " \u0002\u0002\u00ff\u0101\u00074\u0002\u0002\u0100\u00ff\u0003\u0002",
    "\u0002\u0002\u0100\u0101\u0003\u0002\u0002\u0002\u0101\u0102\u0003\u0002",
    "\u0002\u0002\u0102\u0110\u0005\u001e\u0010\u000b\u0103\u0104\f\t\u0002",
    "\u0002\u0104\u0106\u00076\u0002\u0002\u0105\u0107\u00074\u0002\u0002",
    "\u0106\u0105\u0003\u0002\u0002\u0002\u0106\u0107\u0003\u0002\u0002\u0002",
    "\u0107\u0108\u0003\u0002\u0002\u0002\u0108\u0110\u0005\u001e\u0010\n",
    "\u0109\u010b\f\b\u0002\u0002\u010a\u010c\u0007\u001d\u0002\u0002\u010b",
    "\u010a\u0003\u0002\u0002\u0002\u010b\u010c\u0003\u0002\u0002\u0002\u010c",
    "\u010d\u0003\u0002\u0002\u0002\u010d\u010e\u0007,\u0002\u0002\u010e",
    "\u0110\u0005\u001e\u0010\t\u010f\u00f1\u0003\u0002\u0002\u0002\u010f",
    "\u00f4\u0003\u0002\u0002\u0002\u010f\u00f7\u0003\u0002\u0002\u0002\u010f",
    "\u00fd\u0003\u0002\u0002\u0002\u010f\u0103\u0003\u0002\u0002\u0002\u010f",
    "\u0109\u0003\u0002\u0002\u0002\u0110\u0113\u0003\u0002\u0002\u0002\u0111",
    "\u010f\u0003\u0002\u0002\u0002\u0111\u0112\u0003\u0002\u0002\u0002\u0112",
    "\u001f\u0003\u0002\u0002\u0002\u0113\u0111\u0003\u0002\u0002\u0002\u0114",
    "\u0115\t\u0004\u0002\u0002\u0115\u0116\u0007\f\u0002\u0002\u0116\u011b",
    "\u0005\"\u0012\u0002\u0117\u0118\u0007\u0006\u0002\u0002\u0118\u011a",
    "\u0005\"\u0012\u0002\u0119\u0117\u0003\u0002\u0002\u0002\u011a\u011d",
    "\u0003\u0002\u0002\u0002\u011b\u0119\u0003\u0002\u0002\u0002\u011b\u011c",
    "\u0003\u0002\u0002\u0002\u011c\u011e\u0003\u0002\u0002\u0002\u011d\u011b",
    "\u0003\u0002\u0002\u0002\u011e\u011f\u0007\u0004\u0002\u0002\u011f!",
    "\u0003\u0002\u0002\u0002\u0120\u0121\b\u0012\u0001\u0002\u0121\u0122",
    "\u0005\u0012\n\u0002\u0122\u0123\u0007\"\u0002\u0002\u0123\u0124\u0005",
    "\"\u0012\u000b\u0124\u012f\u0003\u0002\u0002\u0002\u0125\u012f\u0005",
    " \u0011\u0002\u0126\u012f\u0005\u0014\u000b\u0002\u0127\u012f\u0005",
    "\u0012\n\u0002\u0128\u012a\u0007B\u0002\u0002\u0129\u0128\u0003\u0002",
    "\u0002\u0002\u012a\u012b\u0003\u0002\u0002\u0002\u012b\u0129\u0003\u0002",
    "\u0002\u0002\u012b\u012c\u0003\u0002\u0002\u0002\u012c\u012f\u0003\u0002",
    "\u0002\u0002\u012d\u012f\u0007A\u0002\u0002\u012e\u0120\u0003\u0002",
    "\u0002\u0002\u012e\u0125\u0003\u0002\u0002\u0002\u012e\u0126\u0003\u0002",
    "\u0002\u0002\u012e\u0127\u0003\u0002\u0002\u0002\u012e\u0129\u0003\u0002",
    "\u0002\u0002\u012e\u012d\u0003\u0002\u0002\u0002\u012f\u013e\u0003\u0002",
    "\u0002\u0002\u0130\u0131\f\f\u0002\u0002\u0131\u0132\u0007\t\u0002\u0002",
    "\u0132\u013d\u0005\"\u0012\r\u0133\u0134\f\n\u0002\u0002\u0134\u0135",
    "\u0007 \u0002\u0002\u0135\u013d\u0005\"\u0012\u000b\u0136\u0137\f\t",
    "\u0002\u0002\u0137\u0138\u00076\u0002\u0002\u0138\u013d\u0005\"\u0012",
    "\n\u0139\u013a\f\b\u0002\u0002\u013a\u013b\u0007\n\u0002\u0002\u013b",
    "\u013d\u0005\"\u0012\t\u013c\u0130\u0003\u0002\u0002\u0002\u013c\u0133",
    "\u0003\u0002\u0002\u0002\u013c\u0136\u0003\u0002\u0002\u0002\u013c\u0139",
    "\u0003\u0002\u0002\u0002\u013d\u0140\u0003\u0002\u0002\u0002\u013e\u013c",
    "\u0003\u0002\u0002\u0002\u013e\u013f\u0003\u0002\u0002\u0002\u013f#",
    "\u0003\u0002\u0002\u0002\u0140\u013e\u0003\u0002\u0002\u0002\u0141\u0144",
    "\u0005\u0014\u000b\u0002\u0142\u0144\u0005\u0012\n\u0002\u0143\u0141",
    "\u0003\u0002\u0002\u0002\u0143\u0142\u0003\u0002\u0002\u0002\u0144\u0146",
    "\u0003\u0002\u0002\u0002\u0145\u0147\u0005\u0010\t\u0002\u0146\u0145",
    "\u0003\u0002\u0002\u0002\u0146\u0147\u0003\u0002\u0002\u0002\u0147%",
    "\u0003\u0002\u0002\u0002\u0148\u014b\u0005\u0014\u000b\u0002\u0149\u014b",
    "\u0005\u0012\n\u0002\u014a\u0148\u0003\u0002\u0002\u0002\u014a\u0149",
    "\u0003\u0002\u0002\u0002\u014b\'\u0003\u0002\u0002\u0002\u014c\u014d",
    "\t\u0005\u0002\u0002\u014d)\u0003\u0002\u0002\u0002\u014e\u014f\u0007",
    "-\u0002\u0002\u014f\u0150\u0005(\u0015\u0002\u0150+\u0003\u0002\u0002",
    "\u0002\u0151\u0153\u0007!\u0002\u0002\u0152\u0151\u0003\u0002\u0002",
    "\u0002\u0152\u0153\u0003\u0002\u0002\u0002\u0153\u0154\u0003\u0002\u0002",
    "\u0002\u0154\u0155\u0007C\u0002\u0002\u0155-\u0003\u0002\u0002\u0002",
    "2169<?BELRV`dimr|\u008a\u008d\u0095\u0098\u00a3\u00a6\u00ae\u00b1\u00b5",
    "\u00b8\u00c5\u00ce\u00d2\u00d5\u00e1\u00e6\u00e9\u00ef\u0100\u0106\u010b",
    "\u010f\u0111\u011b\u012b\u012e\u013c\u013e\u0143\u0146\u014a\u0152"].join("");


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.PredictionContextCache();

export default class RqlParser extends antlr4.Parser {

    static grammarFileName = "RqlParser.g4";
    static literalNames = [ null, "'}'", "')'", "']'", "','", "'.'", "'\"'", 
                            null, null, "'{'", "'('", "'['", "'/'", "':'", 
                            "';'", null, "'+'", "'-'", "'@'", "'#'", "'$'", 
                            "'%'", "'^'", "'&'", "'*'", "'?'", "'!'", null, 
                            "'@all_docs'", null, null, null, null, null, 
                            null, null, null, null, null, null, null, null, 
                            null, null, null, null, null, null, null, null, 
                            null, null, null, null, null, null, null, null, 
                            null, null, null, null, "'declare function'" ];
    static symbolicNames = [ null, "CL_CUR", "CL_PAR", "CL_Q", "COMMA", 
                             "DOT", "D_QUOTE", "EQUAL", "MATH", "OP_CUR", 
                             "OP_PAR", "OP_Q", "SLASH", "COLON", "SEMICOLON", 
                             "BACKSLASH", "PLUS", "MINUS", "AT", "HASH", 
                             "DOL", "PERCENT", "POWER", "AMP", "STAR", "QUESTION_MARK", 
                             "EXCLAMATION", "ALL", "ALL_DOCS", "ALPHANUMERIC", 
                             "AND", "AS", "BETWEEN", "DECLARE", "DISTINCT", 
                             "DOUBLE", "ENDS_WITH", "STARTS_WITH", "FALSE", 
                             "FACET", "FROM", "GROUP_BY", "IN", "INCLUDE", 
                             "INDEX", "INTERSECT", "LOAD", "LONG", "MATCH", 
                             "MORELIKETHIS", "NOT", "NULL", "OR", "ORDER_BY", 
                             "SELECT", "SORTING", "STRING_W", "TRUE", "WHERE", 
                             "WITH", "EXACT", "BOOST", "JS_FUNCTION_DECLARATION", 
                             "NUM", "STRING", "WORD", "WS" ];
    static ruleNames = [ "prog", "fromStatement", "indexName", "loadStatement", 
                         "selectStatement", "jsFunction", "jsCode", "alias", 
                         "variable", "custom_function", "whereStatement", 
                         "groupByStatement", "orderByStatement", "orderBySorting", 
                         "expr", "specialFunctions", "specialParam", "parameterWithOptionalAlias", 
                         "parameter", "collectionName", "includeStatement", 
                         "fromAlias" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = RqlParser.ruleNames;
        this.literalNames = RqlParser.literalNames;
        this.symbolicNames = RqlParser.symbolicNames;
    }

    get atn() {
        return atn;
    }

    sempred(localctx, ruleIndex, predIndex) {
    	switch(ruleIndex) {
    	case 14:
    	    		return this.expr_sempred(localctx, predIndex);
    	case 16:
    	    		return this.specialParam_sempred(localctx, predIndex);
        default:
            throw "No predicate with index:" + ruleIndex;
       }
    }

    expr_sempred(localctx, predIndex) {
    	switch(predIndex) {
    		case 0:
    			return this.precpred(this._ctx, 11);
    		case 1:
    			return this.precpred(this._ctx, 10);
    		case 2:
    			return this.precpred(this._ctx, 9);
    		case 3:
    			return this.precpred(this._ctx, 8);
    		case 4:
    			return this.precpred(this._ctx, 7);
    		case 5:
    			return this.precpred(this._ctx, 6);
    		default:
    			throw "No predicate with index:" + predIndex;
    	}
    };

    specialParam_sempred(localctx, predIndex) {
    	switch(predIndex) {
    		case 6:
    			return this.precpred(this._ctx, 10);
    		case 7:
    			return this.precpred(this._ctx, 8);
    		case 8:
    			return this.precpred(this._ctx, 7);
    		case 9:
    			return this.precpred(this._ctx, 6);
    		default:
    			throw "No predicate with index:" + predIndex;
    	}
    };




	prog() {
	    let localctx = new ProgContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, RqlParser.RULE_prog);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 47;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===RqlParser.JS_FUNCTION_DECLARATION) {
	            this.state = 44;
	            this.jsFunction();
	            this.state = 49;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 50;
	        this.fromStatement();
	        this.state = 52;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===RqlParser.LOAD) {
	            this.state = 51;
	            this.loadStatement();
	        }

	        this.state = 55;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===RqlParser.WHERE) {
	            this.state = 54;
	            this.whereStatement();
	        }

	        this.state = 58;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===RqlParser.GROUP_BY) {
	            this.state = 57;
	            this.groupByStatement();
	        }

	        this.state = 61;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===RqlParser.ORDER_BY) {
	            this.state = 60;
	            this.orderByStatement();
	        }

	        this.state = 64;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===RqlParser.INCLUDE) {
	            this.state = 63;
	            this.includeStatement();
	        }

	        this.state = 67;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===RqlParser.SELECT) {
	            this.state = 66;
	            this.selectStatement();
	        }

	        this.state = 69;
	        this.match(RqlParser.EOF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	fromStatement() {
	    let localctx = new FromStatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, RqlParser.RULE_fromStatement);
	    var _la = 0; // Token type
	    try {
	        this.state = 84;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,9,this._ctx);
	        switch(la_) {
	        case 1:
	            localctx = new CollectionByNameContext(this, localctx);
	            this.enterOuterAlt(localctx, 1);
	            this.state = 71;
	            this.match(RqlParser.FROM);
	            this.state = 72;
	            this.collectionName();
	            this.state = 74;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            if(_la===RqlParser.AS || _la===RqlParser.WORD) {
	                this.state = 73;
	                this.fromAlias();
	            }

	            break;

	        case 2:
	            localctx = new CollectionByIndexContext(this, localctx);
	            this.enterOuterAlt(localctx, 2);
	            this.state = 76;
	            this.match(RqlParser.FROM);
	            this.state = 77;
	            this.match(RqlParser.INDEX);
	            this.state = 78;
	            this.indexName();
	            this.state = 80;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            if(_la===RqlParser.AS || _la===RqlParser.WORD) {
	                this.state = 79;
	                this.fromAlias();
	            }

	            break;

	        case 3:
	            localctx = new AllCollectionsContext(this, localctx);
	            this.enterOuterAlt(localctx, 3);
	            this.state = 82;
	            this.match(RqlParser.FROM);
	            this.state = 83;
	            this.match(RqlParser.ALL_DOCS);
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	indexName() {
	    let localctx = new IndexNameContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, RqlParser.RULE_indexName);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 86;
	        this.match(RqlParser.STRING);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	loadStatement() {
	    let localctx = new LoadStatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, RqlParser.RULE_loadStatement);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 88;
	        this.match(RqlParser.LOAD);
	        this.state = 89;
	        this.variable();
	        this.state = 90;
	        this.alias();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	selectStatement() {
	    let localctx = new SelectStatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, RqlParser.RULE_selectStatement);
	    var _la = 0; // Token type
	    try {
	        this.state = 112;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,14,this._ctx);
	        switch(la_) {
	        case 1:
	            localctx = new ProjectIndividualFieldsContext(this, localctx);
	            this.enterOuterAlt(localctx, 1);
	            this.state = 92;
	            this.match(RqlParser.SELECT);
	            this.state = 94;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            if(_la===RqlParser.DISTINCT) {
	                this.state = 93;
	                this.match(RqlParser.DISTINCT);
	            }

	            this.state = 98;
	            this._errHandler.sync(this);
	            switch(this._input.LA(1)) {
	            case RqlParser.WORD:
	                this.state = 96;
	                this.parameterWithOptionalAlias();
	                break;
	            case RqlParser.ENDS_WITH:
	            case RqlParser.STARTS_WITH:
	            case RqlParser.FACET:
	            case RqlParser.INTERSECT:
	            case RqlParser.MORELIKETHIS:
	            case RqlParser.EXACT:
	            case RqlParser.BOOST:
	                this.state = 97;
	                this.specialFunctions();
	                break;
	            default:
	                throw new antlr4.error.NoViableAltException(this);
	            }
	            this.state = 107;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            while(_la===RqlParser.COMMA) {
	                this.state = 100;
	                this.match(RqlParser.COMMA);

	                this.state = 103;
	                this._errHandler.sync(this);
	                switch(this._input.LA(1)) {
	                case RqlParser.WORD:
	                    this.state = 101;
	                    this.parameterWithOptionalAlias();
	                    break;
	                case RqlParser.ENDS_WITH:
	                case RqlParser.STARTS_WITH:
	                case RqlParser.FACET:
	                case RqlParser.INTERSECT:
	                case RqlParser.MORELIKETHIS:
	                case RqlParser.EXACT:
	                case RqlParser.BOOST:
	                    this.state = 102;
	                    this.specialFunctions();
	                    break;
	                default:
	                    throw new antlr4.error.NoViableAltException(this);
	                }
	                this.state = 109;
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	            }
	            break;

	        case 2:
	            localctx = new JavascriptCodeContext(this, localctx);
	            this.enterOuterAlt(localctx, 2);
	            this.state = 110;
	            this.match(RqlParser.SELECT);
	            this.state = 111;
	            this.jsCode();
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	jsFunction() {
	    let localctx = new JsFunctionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, RqlParser.RULE_jsFunction);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 114;
	        this.match(RqlParser.JS_FUNCTION_DECLARATION);
	        this.state = 115;
	        this.match(RqlParser.WORD);
	        this.state = 116;
	        this.match(RqlParser.OP_PAR);
	        this.state = 117;
	        this.match(RqlParser.WORD);
	        this.state = 122;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===RqlParser.COMMA) {
	            this.state = 118;
	            this.match(RqlParser.COMMA);
	            this.state = 119;
	            this.match(RqlParser.WORD);
	            this.state = 124;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 125;
	        this.match(RqlParser.CL_PAR);
	        this.state = 127;
	        this.jsCode();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	jsCode() {
	    let localctx = new JsCodeContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, RqlParser.RULE_jsCode);
	    try {
	        this.state = 139;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,17,this._ctx);
	        switch(la_) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 129;
	            this.match(RqlParser.OP_CUR);
	            this.state = 130;
	            this.jsCode();
	            this.state = 131;
	            this.match(RqlParser.CL_CUR);
	            break;

	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 136;
	            this._errHandler.sync(this);
	            var _alt = this._interp.adaptivePredict(this._input,16,this._ctx)
	            while(_alt!=1 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	                if(_alt===1+1) {
	                    this.state = 133;
	                    this.matchWildcard(); 
	                }
	                this.state = 138;
	                this._errHandler.sync(this);
	                _alt = this._interp.adaptivePredict(this._input,16,this._ctx);
	            }

	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	alias() {
	    let localctx = new AliasContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, RqlParser.RULE_alias);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 141;
	        this.match(RqlParser.AS);
	        this.state = 142;
	        this.match(RqlParser.WORD);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	variable() {
	    let localctx = new VariableContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, RqlParser.RULE_variable);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 150;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,19,this._ctx);
	        if(la_===1) {
	            this.state = 144;
	            this.match(RqlParser.WORD);
	            this.state = 147;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            if(_la===RqlParser.OP_Q) {
	                this.state = 145;
	                this.match(RqlParser.OP_Q);
	                this.state = 146;
	                this.match(RqlParser.CL_Q);
	            }

	            this.state = 149;
	            this.match(RqlParser.DOT);

	        }
	        this.state = 152;
	        this.match(RqlParser.WORD);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	custom_function() {
	    let localctx = new Custom_functionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 18, RqlParser.RULE_custom_function);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 154;
	        this.variable();
	        this.state = 155;
	        this.match(RqlParser.OP_PAR);
	        this.state = 182;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(((((_la - 63)) & ~0x1f) == 0 && ((1 << (_la - 63)) & ((1 << (RqlParser.NUM - 63)) | (1 << (RqlParser.STRING - 63)) | (1 << (RqlParser.WORD - 63)))) !== 0)) {
	            this.state = 164;
	            this._errHandler.sync(this);
	            var la_ = this._interp.adaptivePredict(this._input,21,this._ctx);
	            switch(la_) {
	            case 1:
	                this.state = 156;
	                this.custom_function();
	                break;

	            case 2:
	                this.state = 157;
	                this.variable();
	                break;

	            case 3:
	                this.state = 159; 
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	                do {
	                    this.state = 158;
	                    this.match(RqlParser.STRING);
	                    this.state = 161; 
	                    this._errHandler.sync(this);
	                    _la = this._input.LA(1);
	                } while(_la===RqlParser.STRING);
	                break;

	            case 4:
	                this.state = 163;
	                this.match(RqlParser.NUM);
	                break;

	            }
	            this.state = 179;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            while(_la===RqlParser.COMMA) {
	                this.state = 166;
	                this.match(RqlParser.COMMA);
	                this.state = 175;
	                this._errHandler.sync(this);
	                var la_ = this._interp.adaptivePredict(this._input,23,this._ctx);
	                switch(la_) {
	                case 1:
	                    this.state = 167;
	                    this.custom_function();
	                    break;

	                case 2:
	                    this.state = 168;
	                    this.variable();
	                    break;

	                case 3:
	                    this.state = 170; 
	                    this._errHandler.sync(this);
	                    _la = this._input.LA(1);
	                    do {
	                        this.state = 169;
	                        this.match(RqlParser.STRING);
	                        this.state = 172; 
	                        this._errHandler.sync(this);
	                        _la = this._input.LA(1);
	                    } while(_la===RqlParser.STRING);
	                    break;

	                case 4:
	                    this.state = 174;
	                    this.match(RqlParser.NUM);
	                    break;

	                }
	                this.state = 181;
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	            }
	        }

	        this.state = 184;
	        this.match(RqlParser.CL_PAR);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	whereStatement() {
	    let localctx = new WhereStatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 20, RqlParser.RULE_whereStatement);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 186;
	        this.match(RqlParser.WHERE);
	        this.state = 187;
	        this.expr(0);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	groupByStatement() {
	    let localctx = new GroupByStatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 22, RqlParser.RULE_groupByStatement);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 189;
	        this.match(RqlParser.GROUP_BY);

	        this.state = 190;
	        this.parameterWithOptionalAlias();
	        this.state = 195;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===RqlParser.COMMA) {
	            this.state = 191;
	            this.match(RqlParser.COMMA);

	            this.state = 192;
	            this.parameterWithOptionalAlias();
	            this.state = 197;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	orderByStatement() {
	    let localctx = new OrderByStatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 24, RqlParser.RULE_orderByStatement);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 198;
	        this.match(RqlParser.ORDER_BY);

	        this.state = 199;
	        this.parameterWithOptionalAlias();
	        this.state = 204;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===RqlParser.COMMA) {
	            this.state = 200;
	            this.match(RqlParser.COMMA);

	            this.state = 201;
	            this.parameterWithOptionalAlias();
	            this.state = 206;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 208;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===RqlParser.AS) {
	            this.state = 207;
	            this.orderBySorting();
	        }

	        this.state = 211;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===RqlParser.SORTING) {
	            this.state = 210;
	            this.match(RqlParser.SORTING);
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	orderBySorting() {
	    let localctx = new OrderBySortingContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 26, RqlParser.RULE_orderBySorting);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 213;
	        this.match(RqlParser.AS);
	        this.state = 214;
	        _la = this._input.LA(1);
	        if(!(((((_la - 29)) & ~0x1f) == 0 && ((1 << (_la - 29)) & ((1 << (RqlParser.ALPHANUMERIC - 29)) | (1 << (RqlParser.DOUBLE - 29)) | (1 << (RqlParser.LONG - 29)) | (1 << (RqlParser.STRING_W - 29)))) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


	expr(_p) {
		if(_p===undefined) {
		    _p = 0;
		}
	    const _parentctx = this._ctx;
	    const _parentState = this.state;
	    let localctx = new ExprContext(this, this._ctx, _parentState);
	    let _prevctx = localctx;
	    const _startState = 28;
	    this.enterRecursionRule(localctx, 28, RqlParser.RULE_expr, _p);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 237;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,33,this._ctx);
	        switch(la_) {
	        case 1:
	            localctx = new SpecialFunctionExprContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;

	            this.state = 217;
	            this.specialFunctions();
	            break;

	        case 2:
	            localctx = new ParentissExprContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 218;
	            this.match(RqlParser.OP_PAR);
	            this.state = 219;
	            this.expr(0);
	            this.state = 220;
	            this.match(RqlParser.CL_PAR);
	            break;

	        case 3:
	            localctx = new WordValueExprContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 223;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            if(_la===RqlParser.COMMA) {
	                this.state = 222;
	                this.match(RqlParser.COMMA);
	            }

	            this.state = 226; 
	            this._errHandler.sync(this);
	            var _alt = 1;
	            do {
	            	switch (_alt) {
	            	case 1:
	            		this.state = 225;
	            		this.match(RqlParser.STRING);
	            		break;
	            	default:
	            		throw new antlr4.error.NoViableAltException(this);
	            	}
	            	this.state = 228; 
	            	this._errHandler.sync(this);
	            	_alt = this._interp.adaptivePredict(this._input,31, this._ctx);
	            } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	            this.state = 231;
	            this._errHandler.sync(this);
	            var la_ = this._interp.adaptivePredict(this._input,32,this._ctx);
	            if(la_===1) {
	                this.state = 230;
	                this.expr(0);

	            }
	            break;

	        case 4:
	            localctx = new NumExprContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 233;
	            this.match(RqlParser.NUM);
	            break;

	        case 5:
	            localctx = new BooleanExprContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 234;
	            _la = this._input.LA(1);
	            if(!(_la===RqlParser.FALSE || _la===RqlParser.TRUE)) {
	            this._errHandler.recoverInline(this);
	            }
	            else {
	            	this._errHandler.reportMatch(this);
	                this.consume();
	            }
	            break;

	        case 6:
	            localctx = new FunctionExprContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 235;
	            this.custom_function();
	            break;

	        case 7:
	            localctx = new VariableExprContext(this, localctx);
	            this._ctx = localctx;
	            _prevctx = localctx;
	            this.state = 236;
	            this.variable();
	            break;

	        }
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 271;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,38,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                this.state = 269;
	                this._errHandler.sync(this);
	                var la_ = this._interp.adaptivePredict(this._input,37,this._ctx);
	                switch(la_) {
	                case 1:
	                    localctx = new EqualExprContext(this, new ExprContext(this, _parentctx, _parentState));
	                    this.pushNewRecursionContext(localctx, _startState, RqlParser.RULE_expr);
	                    this.state = 239;
	                    if (!( this.precpred(this._ctx, 11))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 11)");
	                    }
	                    this.state = 240;
	                    this.match(RqlParser.EQUAL);
	                    this.state = 241;
	                    this.expr(12);
	                    break;

	                case 2:
	                    localctx = new MathOperatorExprContext(this, new ExprContext(this, _parentctx, _parentState));
	                    this.pushNewRecursionContext(localctx, _startState, RqlParser.RULE_expr);
	                    this.state = 242;
	                    if (!( this.precpred(this._ctx, 10))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 10)");
	                    }
	                    this.state = 243;
	                    this.match(RqlParser.MATH);
	                    this.state = 244;
	                    this.expr(11);
	                    break;

	                case 3:
	                    localctx = new BetweenExprContext(this, new ExprContext(this, _parentctx, _parentState));
	                    this.pushNewRecursionContext(localctx, _startState, RqlParser.RULE_expr);
	                    this.state = 245;
	                    if (!( this.precpred(this._ctx, 9))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 9)");
	                    }
	                    this.state = 246;
	                    this.match(RqlParser.BETWEEN);
	                    this.state = 247;
	                    this.expr(0);
	                    this.state = 248;
	                    this.match(RqlParser.AND);
	                    this.state = 249;
	                    this.expr(10);
	                    break;

	                case 4:
	                    localctx = new AndExprContext(this, new ExprContext(this, _parentctx, _parentState));
	                    this.pushNewRecursionContext(localctx, _startState, RqlParser.RULE_expr);
	                    this.state = 251;
	                    if (!( this.precpred(this._ctx, 8))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 8)");
	                    }
	                    this.state = 252;
	                    this.match(RqlParser.AND);
	                    this.state = 254;
	                    this._errHandler.sync(this);
	                    _la = this._input.LA(1);
	                    if(_la===RqlParser.NOT) {
	                        this.state = 253;
	                        this.match(RqlParser.NOT);
	                    }

	                    this.state = 256;
	                    this.expr(9);
	                    break;

	                case 5:
	                    localctx = new OrExprContext(this, new ExprContext(this, _parentctx, _parentState));
	                    this.pushNewRecursionContext(localctx, _startState, RqlParser.RULE_expr);
	                    this.state = 257;
	                    if (!( this.precpred(this._ctx, 7))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 7)");
	                    }
	                    this.state = 258;
	                    this.match(RqlParser.OR);
	                    this.state = 260;
	                    this._errHandler.sync(this);
	                    _la = this._input.LA(1);
	                    if(_la===RqlParser.NOT) {
	                        this.state = 259;
	                        this.match(RqlParser.NOT);
	                    }

	                    this.state = 262;
	                    this.expr(8);
	                    break;

	                case 6:
	                    localctx = new ListExprContext(this, new ExprContext(this, _parentctx, _parentState));
	                    this.pushNewRecursionContext(localctx, _startState, RqlParser.RULE_expr);
	                    this.state = 263;
	                    if (!( this.precpred(this._ctx, 6))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 6)");
	                    }
	                    this.state = 265;
	                    this._errHandler.sync(this);
	                    _la = this._input.LA(1);
	                    if(_la===RqlParser.ALL) {
	                        this.state = 264;
	                        this.match(RqlParser.ALL);
	                    }

	                    this.state = 267;
	                    this.match(RqlParser.IN);
	                    this.state = 268;
	                    this.expr(7);
	                    break;

	                } 
	            }
	            this.state = 273;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,38,this._ctx);
	        }

	    } catch( error) {
	        if(error instanceof antlr4.error.RecognitionException) {
		        localctx.exception = error;
		        this._errHandler.reportError(this, error);
		        this._errHandler.recover(this, error);
		    } else {
		    	throw error;
		    }
	    } finally {
	        this.unrollRecursionContexts(_parentctx)
	    }
	    return localctx;
	}



	specialFunctions() {
	    let localctx = new SpecialFunctionsContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 30, RqlParser.RULE_specialFunctions);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 274;
	        _la = this._input.LA(1);
	        if(!(((((_la - 36)) & ~0x1f) == 0 && ((1 << (_la - 36)) & ((1 << (RqlParser.ENDS_WITH - 36)) | (1 << (RqlParser.STARTS_WITH - 36)) | (1 << (RqlParser.FACET - 36)) | (1 << (RqlParser.INTERSECT - 36)) | (1 << (RqlParser.MORELIKETHIS - 36)) | (1 << (RqlParser.EXACT - 36)) | (1 << (RqlParser.BOOST - 36)))) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	        this.state = 275;
	        this.match(RqlParser.OP_PAR);
	        this.state = 276;
	        this.specialParam(0);
	        this.state = 281;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===RqlParser.COMMA) {
	            this.state = 277;
	            this.match(RqlParser.COMMA);
	            this.state = 278;
	            this.specialParam(0);
	            this.state = 283;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 284;
	        this.match(RqlParser.CL_PAR);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


	specialParam(_p) {
		if(_p===undefined) {
		    _p = 0;
		}
	    const _parentctx = this._ctx;
	    const _parentState = this.state;
	    let localctx = new SpecialParamContext(this, this._ctx, _parentState);
	    let _prevctx = localctx;
	    const _startState = 32;
	    this.enterRecursionRule(localctx, 32, RqlParser.RULE_specialParam, _p);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 300;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,41,this._ctx);
	        switch(la_) {
	        case 1:
	            this.state = 287;
	            this.variable();
	            this.state = 288;
	            this.match(RqlParser.BETWEEN);
	            this.state = 289;
	            this.specialParam(9);
	            break;

	        case 2:
	            this.state = 291;
	            this.specialFunctions();
	            break;

	        case 3:
	            this.state = 292;
	            this.custom_function();
	            break;

	        case 4:
	            this.state = 293;
	            this.variable();
	            break;

	        case 5:
	            this.state = 295; 
	            this._errHandler.sync(this);
	            var _alt = 1;
	            do {
	            	switch (_alt) {
	            	case 1:
	            		this.state = 294;
	            		this.match(RqlParser.STRING);
	            		break;
	            	default:
	            		throw new antlr4.error.NoViableAltException(this);
	            	}
	            	this.state = 297; 
	            	this._errHandler.sync(this);
	            	_alt = this._interp.adaptivePredict(this._input,40, this._ctx);
	            } while ( _alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER );
	            break;

	        case 6:
	            this.state = 299;
	            this.match(RqlParser.NUM);
	            break;

	        }
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 316;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,43,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                this.state = 314;
	                this._errHandler.sync(this);
	                var la_ = this._interp.adaptivePredict(this._input,42,this._ctx);
	                switch(la_) {
	                case 1:
	                    localctx = new SpecialParamContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, RqlParser.RULE_specialParam);
	                    this.state = 302;
	                    if (!( this.precpred(this._ctx, 10))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 10)");
	                    }
	                    this.state = 303;
	                    this.match(RqlParser.EQUAL);
	                    this.state = 304;
	                    this.specialParam(11);
	                    break;

	                case 2:
	                    localctx = new SpecialParamContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, RqlParser.RULE_specialParam);
	                    this.state = 305;
	                    if (!( this.precpred(this._ctx, 8))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 8)");
	                    }
	                    this.state = 306;
	                    this.match(RqlParser.AND);
	                    this.state = 307;
	                    this.specialParam(9);
	                    break;

	                case 3:
	                    localctx = new SpecialParamContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, RqlParser.RULE_specialParam);
	                    this.state = 308;
	                    if (!( this.precpred(this._ctx, 7))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 7)");
	                    }
	                    this.state = 309;
	                    this.match(RqlParser.OR);
	                    this.state = 310;
	                    this.specialParam(8);
	                    break;

	                case 4:
	                    localctx = new SpecialParamContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, RqlParser.RULE_specialParam);
	                    this.state = 311;
	                    if (!( this.precpred(this._ctx, 6))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 6)");
	                    }
	                    this.state = 312;
	                    this.match(RqlParser.MATH);
	                    this.state = 313;
	                    this.specialParam(7);
	                    break;

	                } 
	            }
	            this.state = 318;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,43,this._ctx);
	        }

	    } catch( error) {
	        if(error instanceof antlr4.error.RecognitionException) {
		        localctx.exception = error;
		        this._errHandler.reportError(this, error);
		        this._errHandler.recover(this, error);
		    } else {
		    	throw error;
		    }
	    } finally {
	        this.unrollRecursionContexts(_parentctx)
	    }
	    return localctx;
	}



	parameterWithOptionalAlias() {
	    let localctx = new ParameterWithOptionalAliasContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 34, RqlParser.RULE_parameterWithOptionalAlias);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 321;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,44,this._ctx);
	        switch(la_) {
	        case 1:
	            this.state = 319;
	            this.custom_function();
	            break;

	        case 2:
	            this.state = 320;
	            this.variable();
	            break;

	        }
	        this.state = 324;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,45,this._ctx);
	        if(la_===1) {
	            this.state = 323;
	            this.alias();

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	parameter() {
	    let localctx = new ParameterContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 36, RqlParser.RULE_parameter);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 328;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,46,this._ctx);
	        switch(la_) {
	        case 1:
	            this.state = 326;
	            this.custom_function();
	            break;

	        case 2:
	            this.state = 327;
	            this.variable();
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	collectionName() {
	    let localctx = new CollectionNameContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 38, RqlParser.RULE_collectionName);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 330;
	        _la = this._input.LA(1);
	        if(!(_la===RqlParser.STRING || _la===RqlParser.WORD)) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	includeStatement() {
	    let localctx = new IncludeStatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 40, RqlParser.RULE_includeStatement);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 332;
	        this.match(RqlParser.INCLUDE);
	        this.state = 333;
	        this.collectionName();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	fromAlias() {
	    let localctx = new FromAliasContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 42, RqlParser.RULE_fromAlias);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 336;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===RqlParser.AS) {
	            this.state = 335;
	            this.match(RqlParser.AS);
	        }

	        this.state = 338;
	        this.match(RqlParser.WORD);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

RqlParser.EOF = antlr4.Token.EOF;
RqlParser.CL_CUR = 1;
RqlParser.CL_PAR = 2;
RqlParser.CL_Q = 3;
RqlParser.COMMA = 4;
RqlParser.DOT = 5;
RqlParser.D_QUOTE = 6;
RqlParser.EQUAL = 7;
RqlParser.MATH = 8;
RqlParser.OP_CUR = 9;
RqlParser.OP_PAR = 10;
RqlParser.OP_Q = 11;
RqlParser.SLASH = 12;
RqlParser.COLON = 13;
RqlParser.SEMICOLON = 14;
RqlParser.BACKSLASH = 15;
RqlParser.PLUS = 16;
RqlParser.MINUS = 17;
RqlParser.AT = 18;
RqlParser.HASH = 19;
RqlParser.DOL = 20;
RqlParser.PERCENT = 21;
RqlParser.POWER = 22;
RqlParser.AMP = 23;
RqlParser.STAR = 24;
RqlParser.QUESTION_MARK = 25;
RqlParser.EXCLAMATION = 26;
RqlParser.ALL = 27;
RqlParser.ALL_DOCS = 28;
RqlParser.ALPHANUMERIC = 29;
RqlParser.AND = 30;
RqlParser.AS = 31;
RqlParser.BETWEEN = 32;
RqlParser.DECLARE = 33;
RqlParser.DISTINCT = 34;
RqlParser.DOUBLE = 35;
RqlParser.ENDS_WITH = 36;
RqlParser.STARTS_WITH = 37;
RqlParser.FALSE = 38;
RqlParser.FACET = 39;
RqlParser.FROM = 40;
RqlParser.GROUP_BY = 41;
RqlParser.IN = 42;
RqlParser.INCLUDE = 43;
RqlParser.INDEX = 44;
RqlParser.INTERSECT = 45;
RqlParser.LOAD = 46;
RqlParser.LONG = 47;
RqlParser.MATCH = 48;
RqlParser.MORELIKETHIS = 49;
RqlParser.NOT = 50;
RqlParser.NULL = 51;
RqlParser.OR = 52;
RqlParser.ORDER_BY = 53;
RqlParser.SELECT = 54;
RqlParser.SORTING = 55;
RqlParser.STRING_W = 56;
RqlParser.TRUE = 57;
RqlParser.WHERE = 58;
RqlParser.WITH = 59;
RqlParser.EXACT = 60;
RqlParser.BOOST = 61;
RqlParser.JS_FUNCTION_DECLARATION = 62;
RqlParser.NUM = 63;
RqlParser.STRING = 64;
RqlParser.WORD = 65;
RqlParser.WS = 66;

RqlParser.RULE_prog = 0;
RqlParser.RULE_fromStatement = 1;
RqlParser.RULE_indexName = 2;
RqlParser.RULE_loadStatement = 3;
RqlParser.RULE_selectStatement = 4;
RqlParser.RULE_jsFunction = 5;
RqlParser.RULE_jsCode = 6;
RqlParser.RULE_alias = 7;
RqlParser.RULE_variable = 8;
RqlParser.RULE_custom_function = 9;
RqlParser.RULE_whereStatement = 10;
RqlParser.RULE_groupByStatement = 11;
RqlParser.RULE_orderByStatement = 12;
RqlParser.RULE_orderBySorting = 13;
RqlParser.RULE_expr = 14;
RqlParser.RULE_specialFunctions = 15;
RqlParser.RULE_specialParam = 16;
RqlParser.RULE_parameterWithOptionalAlias = 17;
RqlParser.RULE_parameter = 18;
RqlParser.RULE_collectionName = 19;
RqlParser.RULE_includeStatement = 20;
RqlParser.RULE_fromAlias = 21;

class ProgContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RqlParser.RULE_prog;
    }

	fromStatement() {
	    return this.getTypedRuleContext(FromStatementContext,0);
	};

	EOF() {
	    return this.getToken(RqlParser.EOF, 0);
	};

	jsFunction = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(JsFunctionContext);
	    } else {
	        return this.getTypedRuleContext(JsFunctionContext,i);
	    }
	};

	loadStatement() {
	    return this.getTypedRuleContext(LoadStatementContext,0);
	};

	whereStatement() {
	    return this.getTypedRuleContext(WhereStatementContext,0);
	};

	groupByStatement() {
	    return this.getTypedRuleContext(GroupByStatementContext,0);
	};

	orderByStatement() {
	    return this.getTypedRuleContext(OrderByStatementContext,0);
	};

	includeStatement() {
	    return this.getTypedRuleContext(IncludeStatementContext,0);
	};

	selectStatement() {
	    return this.getTypedRuleContext(SelectStatementContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterProg(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitProg(this);
		}
	}


}



class FromStatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RqlParser.RULE_fromStatement;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class CollectionByNameContext extends FromStatementContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	FROM() {
	    return this.getToken(RqlParser.FROM, 0);
	};

	collectionName() {
	    return this.getTypedRuleContext(CollectionNameContext,0);
	};

	fromAlias() {
	    return this.getTypedRuleContext(FromAliasContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterCollectionByName(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitCollectionByName(this);
		}
	}


}

RqlParser.CollectionByNameContext = CollectionByNameContext;

class AllCollectionsContext extends FromStatementContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	FROM() {
	    return this.getToken(RqlParser.FROM, 0);
	};

	ALL_DOCS() {
	    return this.getToken(RqlParser.ALL_DOCS, 0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterAllCollections(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitAllCollections(this);
		}
	}


}

RqlParser.AllCollectionsContext = AllCollectionsContext;

class CollectionByIndexContext extends FromStatementContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	FROM() {
	    return this.getToken(RqlParser.FROM, 0);
	};

	INDEX() {
	    return this.getToken(RqlParser.INDEX, 0);
	};

	indexName() {
	    return this.getTypedRuleContext(IndexNameContext,0);
	};

	fromAlias() {
	    return this.getTypedRuleContext(FromAliasContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterCollectionByIndex(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitCollectionByIndex(this);
		}
	}


}

RqlParser.CollectionByIndexContext = CollectionByIndexContext;

class IndexNameContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RqlParser.RULE_indexName;
    }

	STRING() {
	    return this.getToken(RqlParser.STRING, 0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterIndexName(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitIndexName(this);
		}
	}


}



class LoadStatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RqlParser.RULE_loadStatement;
    }

	LOAD() {
	    return this.getToken(RqlParser.LOAD, 0);
	};

	variable() {
	    return this.getTypedRuleContext(VariableContext,0);
	};

	alias() {
	    return this.getTypedRuleContext(AliasContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterLoadStatement(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitLoadStatement(this);
		}
	}


}



class SelectStatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RqlParser.RULE_selectStatement;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class JavascriptCodeContext extends SelectStatementContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	SELECT() {
	    return this.getToken(RqlParser.SELECT, 0);
	};

	jsCode() {
	    return this.getTypedRuleContext(JsCodeContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterJavascriptCode(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitJavascriptCode(this);
		}
	}


}

RqlParser.JavascriptCodeContext = JavascriptCodeContext;

class ProjectIndividualFieldsContext extends SelectStatementContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	SELECT() {
	    return this.getToken(RqlParser.SELECT, 0);
	};

	parameterWithOptionalAlias = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ParameterWithOptionalAliasContext);
	    } else {
	        return this.getTypedRuleContext(ParameterWithOptionalAliasContext,i);
	    }
	};

	specialFunctions = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(SpecialFunctionsContext);
	    } else {
	        return this.getTypedRuleContext(SpecialFunctionsContext,i);
	    }
	};

	DISTINCT() {
	    return this.getToken(RqlParser.DISTINCT, 0);
	};

	COMMA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(RqlParser.COMMA);
	    } else {
	        return this.getToken(RqlParser.COMMA, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterProjectIndividualFields(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitProjectIndividualFields(this);
		}
	}


}

RqlParser.ProjectIndividualFieldsContext = ProjectIndividualFieldsContext;

class JsFunctionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RqlParser.RULE_jsFunction;
    }

	jsCode() {
	    return this.getTypedRuleContext(JsCodeContext,0);
	};

	JS_FUNCTION_DECLARATION() {
	    return this.getToken(RqlParser.JS_FUNCTION_DECLARATION, 0);
	};

	WORD = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(RqlParser.WORD);
	    } else {
	        return this.getToken(RqlParser.WORD, i);
	    }
	};


	OP_PAR() {
	    return this.getToken(RqlParser.OP_PAR, 0);
	};

	CL_PAR() {
	    return this.getToken(RqlParser.CL_PAR, 0);
	};

	COMMA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(RqlParser.COMMA);
	    } else {
	        return this.getToken(RqlParser.COMMA, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterJsFunction(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitJsFunction(this);
		}
	}


}



class JsCodeContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RqlParser.RULE_jsCode;
    }

	OP_CUR() {
	    return this.getToken(RqlParser.OP_CUR, 0);
	};

	jsCode() {
	    return this.getTypedRuleContext(JsCodeContext,0);
	};

	CL_CUR() {
	    return this.getToken(RqlParser.CL_CUR, 0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterJsCode(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitJsCode(this);
		}
	}


}



class AliasContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RqlParser.RULE_alias;
    }

	AS() {
	    return this.getToken(RqlParser.AS, 0);
	};

	WORD() {
	    return this.getToken(RqlParser.WORD, 0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterAlias(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitAlias(this);
		}
	}


}



class VariableContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RqlParser.RULE_variable;
    }

	WORD = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(RqlParser.WORD);
	    } else {
	        return this.getToken(RqlParser.WORD, i);
	    }
	};


	DOT() {
	    return this.getToken(RqlParser.DOT, 0);
	};

	OP_Q() {
	    return this.getToken(RqlParser.OP_Q, 0);
	};

	CL_Q() {
	    return this.getToken(RqlParser.CL_Q, 0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterVariable(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitVariable(this);
		}
	}


}



class Custom_functionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RqlParser.RULE_custom_function;
    }

	variable = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(VariableContext);
	    } else {
	        return this.getTypedRuleContext(VariableContext,i);
	    }
	};

	OP_PAR() {
	    return this.getToken(RqlParser.OP_PAR, 0);
	};

	CL_PAR() {
	    return this.getToken(RqlParser.CL_PAR, 0);
	};

	custom_function = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(Custom_functionContext);
	    } else {
	        return this.getTypedRuleContext(Custom_functionContext,i);
	    }
	};

	NUM = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(RqlParser.NUM);
	    } else {
	        return this.getToken(RqlParser.NUM, i);
	    }
	};


	COMMA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(RqlParser.COMMA);
	    } else {
	        return this.getToken(RqlParser.COMMA, i);
	    }
	};


	STRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(RqlParser.STRING);
	    } else {
	        return this.getToken(RqlParser.STRING, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterCustom_function(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitCustom_function(this);
		}
	}


}



class WhereStatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RqlParser.RULE_whereStatement;
    }

	WHERE() {
	    return this.getToken(RqlParser.WHERE, 0);
	};

	expr() {
	    return this.getTypedRuleContext(ExprContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterWhereStatement(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitWhereStatement(this);
		}
	}


}



class GroupByStatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RqlParser.RULE_groupByStatement;
    }

	GROUP_BY() {
	    return this.getToken(RqlParser.GROUP_BY, 0);
	};

	parameterWithOptionalAlias = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ParameterWithOptionalAliasContext);
	    } else {
	        return this.getTypedRuleContext(ParameterWithOptionalAliasContext,i);
	    }
	};

	COMMA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(RqlParser.COMMA);
	    } else {
	        return this.getToken(RqlParser.COMMA, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterGroupByStatement(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitGroupByStatement(this);
		}
	}


}



class OrderByStatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RqlParser.RULE_orderByStatement;
    }

	ORDER_BY() {
	    return this.getToken(RqlParser.ORDER_BY, 0);
	};

	parameterWithOptionalAlias = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ParameterWithOptionalAliasContext);
	    } else {
	        return this.getTypedRuleContext(ParameterWithOptionalAliasContext,i);
	    }
	};

	COMMA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(RqlParser.COMMA);
	    } else {
	        return this.getToken(RqlParser.COMMA, i);
	    }
	};


	orderBySorting() {
	    return this.getTypedRuleContext(OrderBySortingContext,0);
	};

	SORTING() {
	    return this.getToken(RqlParser.SORTING, 0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterOrderByStatement(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitOrderByStatement(this);
		}
	}


}



class OrderBySortingContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RqlParser.RULE_orderBySorting;
    }

	AS() {
	    return this.getToken(RqlParser.AS, 0);
	};

	STRING_W() {
	    return this.getToken(RqlParser.STRING_W, 0);
	};

	ALPHANUMERIC() {
	    return this.getToken(RqlParser.ALPHANUMERIC, 0);
	};

	LONG() {
	    return this.getToken(RqlParser.LONG, 0);
	};

	DOUBLE() {
	    return this.getToken(RqlParser.DOUBLE, 0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterOrderBySorting(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitOrderBySorting(this);
		}
	}


}



class ExprContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RqlParser.RULE_expr;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class AndExprContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	expr = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ExprContext);
	    } else {
	        return this.getTypedRuleContext(ExprContext,i);
	    }
	};

	AND() {
	    return this.getToken(RqlParser.AND, 0);
	};

	NOT() {
	    return this.getToken(RqlParser.NOT, 0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterAndExpr(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitAndExpr(this);
		}
	}


}

RqlParser.AndExprContext = AndExprContext;

class WordValueExprContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	COMMA() {
	    return this.getToken(RqlParser.COMMA, 0);
	};

	STRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(RqlParser.STRING);
	    } else {
	        return this.getToken(RqlParser.STRING, i);
	    }
	};


	expr() {
	    return this.getTypedRuleContext(ExprContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterWordValueExpr(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitWordValueExpr(this);
		}
	}


}

RqlParser.WordValueExprContext = WordValueExprContext;

class EqualExprContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	expr = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ExprContext);
	    } else {
	        return this.getTypedRuleContext(ExprContext,i);
	    }
	};

	EQUAL() {
	    return this.getToken(RqlParser.EQUAL, 0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterEqualExpr(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitEqualExpr(this);
		}
	}


}

RqlParser.EqualExprContext = EqualExprContext;

class FunctionExprContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	custom_function() {
	    return this.getTypedRuleContext(Custom_functionContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterFunctionExpr(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitFunctionExpr(this);
		}
	}


}

RqlParser.FunctionExprContext = FunctionExprContext;

class BetweenExprContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	expr = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ExprContext);
	    } else {
	        return this.getTypedRuleContext(ExprContext,i);
	    }
	};

	BETWEEN() {
	    return this.getToken(RqlParser.BETWEEN, 0);
	};

	AND() {
	    return this.getToken(RqlParser.AND, 0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterBetweenExpr(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitBetweenExpr(this);
		}
	}


}

RqlParser.BetweenExprContext = BetweenExprContext;

class MathOperatorExprContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	expr = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ExprContext);
	    } else {
	        return this.getTypedRuleContext(ExprContext,i);
	    }
	};

	MATH() {
	    return this.getToken(RqlParser.MATH, 0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterMathOperatorExpr(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitMathOperatorExpr(this);
		}
	}


}

RqlParser.MathOperatorExprContext = MathOperatorExprContext;

class OrExprContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	expr = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ExprContext);
	    } else {
	        return this.getTypedRuleContext(ExprContext,i);
	    }
	};

	OR() {
	    return this.getToken(RqlParser.OR, 0);
	};

	NOT() {
	    return this.getToken(RqlParser.NOT, 0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterOrExpr(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitOrExpr(this);
		}
	}


}

RqlParser.OrExprContext = OrExprContext;

class ParentissExprContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	OP_PAR() {
	    return this.getToken(RqlParser.OP_PAR, 0);
	};

	expr() {
	    return this.getTypedRuleContext(ExprContext,0);
	};

	CL_PAR() {
	    return this.getToken(RqlParser.CL_PAR, 0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterParentissExpr(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitParentissExpr(this);
		}
	}


}

RqlParser.ParentissExprContext = ParentissExprContext;

class NumExprContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	NUM() {
	    return this.getToken(RqlParser.NUM, 0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterNumExpr(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitNumExpr(this);
		}
	}


}

RqlParser.NumExprContext = NumExprContext;

class VariableExprContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	variable() {
	    return this.getTypedRuleContext(VariableContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterVariableExpr(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitVariableExpr(this);
		}
	}


}

RqlParser.VariableExprContext = VariableExprContext;

class ListExprContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	expr = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ExprContext);
	    } else {
	        return this.getTypedRuleContext(ExprContext,i);
	    }
	};

	IN() {
	    return this.getToken(RqlParser.IN, 0);
	};

	ALL() {
	    return this.getToken(RqlParser.ALL, 0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterListExpr(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitListExpr(this);
		}
	}


}

RqlParser.ListExprContext = ListExprContext;

class SpecialFunctionExprContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	specialFunctions() {
	    return this.getTypedRuleContext(SpecialFunctionsContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterSpecialFunctionExpr(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitSpecialFunctionExpr(this);
		}
	}


}

RqlParser.SpecialFunctionExprContext = SpecialFunctionExprContext;

class BooleanExprContext extends ExprContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	FALSE() {
	    return this.getToken(RqlParser.FALSE, 0);
	};

	TRUE() {
	    return this.getToken(RqlParser.TRUE, 0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterBooleanExpr(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitBooleanExpr(this);
		}
	}


}

RqlParser.BooleanExprContext = BooleanExprContext;

class SpecialFunctionsContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RqlParser.RULE_specialFunctions;
    }

	OP_PAR() {
	    return this.getToken(RqlParser.OP_PAR, 0);
	};

	specialParam = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(SpecialParamContext);
	    } else {
	        return this.getTypedRuleContext(SpecialParamContext,i);
	    }
	};

	CL_PAR() {
	    return this.getToken(RqlParser.CL_PAR, 0);
	};

	FACET() {
	    return this.getToken(RqlParser.FACET, 0);
	};

	BOOST() {
	    return this.getToken(RqlParser.BOOST, 0);
	};

	STARTS_WITH() {
	    return this.getToken(RqlParser.STARTS_WITH, 0);
	};

	ENDS_WITH() {
	    return this.getToken(RqlParser.ENDS_WITH, 0);
	};

	MORELIKETHIS() {
	    return this.getToken(RqlParser.MORELIKETHIS, 0);
	};

	INTERSECT() {
	    return this.getToken(RqlParser.INTERSECT, 0);
	};

	EXACT() {
	    return this.getToken(RqlParser.EXACT, 0);
	};

	COMMA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(RqlParser.COMMA);
	    } else {
	        return this.getToken(RqlParser.COMMA, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterSpecialFunctions(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitSpecialFunctions(this);
		}
	}


}



class SpecialParamContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RqlParser.RULE_specialParam;
    }

	variable() {
	    return this.getTypedRuleContext(VariableContext,0);
	};

	BETWEEN() {
	    return this.getToken(RqlParser.BETWEEN, 0);
	};

	specialParam = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(SpecialParamContext);
	    } else {
	        return this.getTypedRuleContext(SpecialParamContext,i);
	    }
	};

	specialFunctions() {
	    return this.getTypedRuleContext(SpecialFunctionsContext,0);
	};

	custom_function() {
	    return this.getTypedRuleContext(Custom_functionContext,0);
	};

	STRING = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(RqlParser.STRING);
	    } else {
	        return this.getToken(RqlParser.STRING, i);
	    }
	};


	NUM() {
	    return this.getToken(RqlParser.NUM, 0);
	};

	EQUAL() {
	    return this.getToken(RqlParser.EQUAL, 0);
	};

	AND() {
	    return this.getToken(RqlParser.AND, 0);
	};

	OR() {
	    return this.getToken(RqlParser.OR, 0);
	};

	MATH() {
	    return this.getToken(RqlParser.MATH, 0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterSpecialParam(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitSpecialParam(this);
		}
	}


}



class ParameterWithOptionalAliasContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RqlParser.RULE_parameterWithOptionalAlias;
    }

	custom_function() {
	    return this.getTypedRuleContext(Custom_functionContext,0);
	};

	variable() {
	    return this.getTypedRuleContext(VariableContext,0);
	};

	alias() {
	    return this.getTypedRuleContext(AliasContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterParameterWithOptionalAlias(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitParameterWithOptionalAlias(this);
		}
	}


}



class ParameterContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RqlParser.RULE_parameter;
    }

	custom_function() {
	    return this.getTypedRuleContext(Custom_functionContext,0);
	};

	variable() {
	    return this.getTypedRuleContext(VariableContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterParameter(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitParameter(this);
		}
	}


}



class CollectionNameContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RqlParser.RULE_collectionName;
    }

	WORD() {
	    return this.getToken(RqlParser.WORD, 0);
	};

	STRING() {
	    return this.getToken(RqlParser.STRING, 0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterCollectionName(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitCollectionName(this);
		}
	}


}



class IncludeStatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RqlParser.RULE_includeStatement;
    }

	INCLUDE() {
	    return this.getToken(RqlParser.INCLUDE, 0);
	};

	collectionName() {
	    return this.getTypedRuleContext(CollectionNameContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterIncludeStatement(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitIncludeStatement(this);
		}
	}


}



class FromAliasContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = RqlParser.RULE_fromAlias;
    }

	WORD() {
	    return this.getToken(RqlParser.WORD, 0);
	};

	AS() {
	    return this.getToken(RqlParser.AS, 0);
	};

	enterRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.enterFromAlias(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof RqlParserListener ) {
	        listener.exitFromAlias(this);
		}
	}


}




RqlParser.ProgContext = ProgContext; 
RqlParser.FromStatementContext = FromStatementContext; 
RqlParser.IndexNameContext = IndexNameContext; 
RqlParser.LoadStatementContext = LoadStatementContext; 
RqlParser.SelectStatementContext = SelectStatementContext; 
RqlParser.JsFunctionContext = JsFunctionContext; 
RqlParser.JsCodeContext = JsCodeContext; 
RqlParser.AliasContext = AliasContext; 
RqlParser.VariableContext = VariableContext; 
RqlParser.Custom_functionContext = Custom_functionContext; 
RqlParser.WhereStatementContext = WhereStatementContext; 
RqlParser.GroupByStatementContext = GroupByStatementContext; 
RqlParser.OrderByStatementContext = OrderByStatementContext; 
RqlParser.OrderBySortingContext = OrderBySortingContext; 
RqlParser.ExprContext = ExprContext; 
RqlParser.SpecialFunctionsContext = SpecialFunctionsContext; 
RqlParser.SpecialParamContext = SpecialParamContext; 
RqlParser.ParameterWithOptionalAliasContext = ParameterWithOptionalAliasContext; 
RqlParser.ParameterContext = ParameterContext; 
RqlParser.CollectionNameContext = CollectionNameContext; 
RqlParser.IncludeStatementContext = IncludeStatementContext; 
RqlParser.FromAliasContext = FromAliasContext; 
