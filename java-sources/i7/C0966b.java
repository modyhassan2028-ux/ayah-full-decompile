package i7;

import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0828i2;
import com.google.android.gms.internal.measurement.C0802d1;
import com.google.android.gms.internal.measurement.C0817g1;
import com.google.android.gms.internal.measurement.C0866q0;
import com.google.android.gms.internal.measurement.C0875s0;
import com.google.android.gms.internal.measurement.C0886u1;
import com.google.android.gms.internal.measurement.C0890v0;
import com.google.android.gms.internal.measurement.C0898w3;
import com.google.android.gms.internal.measurement.C0900x0;
import com.google.android.gms.internal.measurement.C0905y0;
import j$.util.DesugarCollections;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import u.C1350e;

/* JADX INFO: renamed from: i7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0966b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f17259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f17260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f17261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f17262f;
    public final /* synthetic */ int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0969c f17263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC0828i2 f17264i;

    public C0966b(C0969c c0969c, String str, int i10, AbstractC0828i2 abstractC0828i2, int i11) {
        this.g = i11;
        this.f17263h = c0969c;
        this.f17257a = str;
        this.f17258b = i10;
        this.f17264i = abstractC0828i2;
    }

    public static Boolean c(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, C0905y0 c0905y0, X x9) {
        List listU;
        U6.y.f(c0905y0);
        if (str != null && c0905y0.p() && c0905y0.x() != 1 && (c0905y0.x() != 7 ? c0905y0.q() : c0905y0.v() != 0)) {
            int iX = c0905y0.x();
            boolean zT = c0905y0.t();
            String strR = (zT || iX == 2 || iX == 7) ? c0905y0.r() : c0905y0.r().toUpperCase(Locale.ENGLISH);
            if (c0905y0.v() == 0) {
                listU = null;
            } else {
                listU = c0905y0.u();
                if (!zT) {
                    ArrayList arrayList = new ArrayList(listU.size());
                    Iterator it = listU.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listU = DesugarCollections.unmodifiableList(arrayList);
                }
            }
            String str2 = iX == 2 ? strR : null;
            if (iX != 7 ? strR != null : listU != null && !listU.isEmpty()) {
                if (!zT && iX != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iX - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zT ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (x9 != null) {
                                    x9.f17185z.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strR));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strR));
                    case 4:
                        return Boolean.valueOf(str.contains(strR));
                    case 5:
                        return Boolean.valueOf(str.equals(strR));
                    case 6:
                        if (listU != null) {
                            return Boolean.valueOf(listU.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x009c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:77:0x0101  */
    /* JADX WARN: Code duplicated, block: B:80:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x010a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0111  */
    public static Boolean e(BigDecimal bigDecimal, C0890v0 c0890v0, double d5) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        int i10;
        U6.y.f(c0890v0);
        if (c0890v0.p()) {
            if (c0890v0.z() != 1 && (c0890v0.z() != 5 ? c0890v0.s() : c0890v0.u() && c0890v0.w())) {
                int iZ = c0890v0.z();
                try {
                    if (c0890v0.z() == 5) {
                        if (C0967b0.U(c0890v0.v()) && C0967b0.U(c0890v0.x())) {
                            BigDecimal bigDecimal5 = new BigDecimal(c0890v0.v());
                            bigDecimal4 = new BigDecimal(c0890v0.x());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                            if (iZ == 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                                i10 = iZ - 1;
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        if (i10 != 3) {
                                            if (i10 == 4 && bigDecimal3 != null) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                            }
                                        } else if (bigDecimal2 != null) {
                                            if (d5 != 0.0d) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d5).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d5).multiply(new BigDecimal(2)))) < 0);
                                            }
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                                }
                            }
                        }
                    } else if (C0967b0.U(c0890v0.t())) {
                        bigDecimal2 = new BigDecimal(c0890v0.t());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                        if (iZ == 5) {
                            i10 = iZ - 1;
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 != 3) {
                                        if (i10 == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d5 != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d5).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d5).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        } else {
                            i10 = iZ - 1;
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 != 3) {
                                        if (i10 == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d5 != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d5).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d5).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0279  */
    /* JADX WARN: Code duplicated, block: B:105:0x0299  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:120:0x02de  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:131:0x030a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0310  */
    /* JADX WARN: Code duplicated, block: B:135:0x0324  */
    /* JADX WARN: Code duplicated, block: B:137:0x032a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0332  */
    /* JADX WARN: Code duplicated, block: B:141:0x033c  */
    /* JADX WARN: Code duplicated, block: B:150:0x035f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0368  */
    /* JADX WARN: Code duplicated, block: B:158:0x039f A[EDGE_INSN: B:158:0x039f->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:159:0x03b2 A[EDGE_INSN: B:159:0x03b2->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:199:0x0343 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x036f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x03c9 A[EDGE_INSN: B:234:0x03c9->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x017c  */
    /* JADX WARN: Code duplicated, block: B:61:0x018f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ac A[LOOP:1: B:59:0x0189->B:64:0x01ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0207  */
    /* JADX WARN: Code duplicated, block: B:82:0x0210  */
    /* JADX WARN: Code duplicated, block: B:86:0x021c  */
    /* JADX WARN: Code duplicated, block: B:91:0x024c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0260  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean a(Long l10, Long l11, C0802d1 c0802d1, long j, r rVar, boolean z10) {
        HashSet hashSet;
        Iterator it;
        C1350e c1350e;
        Iterator it2;
        Iterator it3;
        C0875s0 c0875s0;
        boolean z11;
        String strW;
        Object obj;
        Boolean boolE;
        Boolean boolE2;
        String str;
        C0890v0 c0890v0S;
        long j10;
        Boolean boolE3;
        C0817g1 c0817g1;
        Long lValueOf;
        Double dValueOf;
        C0875s0 c0875s1;
        Boolean boolE4;
        int i10;
        C0898w3.a();
        C0969c c0969c = this.f17263h;
        C1023u0 c1023u0 = (C1023u0) c0969c.f16104r;
        C0981g c0981g = c1023u0.f17582u;
        X x9 = c1023u0.f17584w;
        S s10 = c1023u0.f17563A;
        F f3 = G.f16895G0;
        String str2 = this.f17257a;
        boolean zY = c0981g.y(str2, f3);
        C0866q0 c0866q0 = (C0866q0) this.f17264i;
        long j11 = c0866q0.A() ? rVar.f17525e : j;
        C1023u0.m(x9);
        V v10 = x9.f17178E;
        V v11 = x9.f17185z;
        boolean zIsLoggable = Log.isLoggable(x9.y(), 2);
        int i11 = this.f17258b;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (zIsLoggable) {
            C1023u0.m(x9);
            v10.d("Evaluating filter. audience, filter, event", Integer.valueOf(i11), c0866q0.p() ? Integer.valueOf(c0866q0.q()) : null, s10.a(c0866q0.r()));
            C1023u0.m(x9);
            C0967b0 c0967b0 = c0969c.f17001s.f17110x;
            Q1.U(c0967b0);
            StringBuilder sb = new StringBuilder();
            sb.append("\nevent_filter {\n");
            if (c0866q0.p()) {
                i10 = 0;
                C0967b0.G(sb, 0, "filter_id", Integer.valueOf(c0866q0.q()));
            } else {
                i10 = 0;
            }
            C0967b0.G(sb, i10, "event_name", ((C1023u0) c0967b0.f16104r).f17563A.a(c0866q0.r()));
            String strC = C0967b0.C(c0866q0.x(), c0866q0.y(), c0866q0.A());
            if (!strC.isEmpty()) {
                C0967b0.G(sb, 0, "filter_type", strC);
            }
            if (c0866q0.v()) {
                C0967b0.H(sb, 1, "event_count_filter", c0866q0.w());
            }
            if (c0866q0.t() > 0) {
                sb.append("  filters {\n");
                Iterator it4 = c0866q0.s().iterator();
                while (it4.hasNext()) {
                    c0967b0.z(sb, 2, (C0875s0) it4.next());
                }
            }
            C0967b0.A(1, sb);
            sb.append("}\n}\n");
            v10.b(sb.toString(), "Filter definition");
        }
        if (!c0866q0.p() || c0866q0.q() > 256) {
            C1023u0.m(x9);
            v11.c(X.w(str2), String.valueOf(c0866q0.p() ? Integer.valueOf(c0866q0.q()) : null), "Invalid event filter ID. appId, id");
            return false;
        }
        boolean z12 = c0866q0.x() || c0866q0.y() || c0866q0.A();
        if (z10 && !z12) {
            C1023u0.m(x9);
            v10.c(Integer.valueOf(i11), c0866q0.p() ? Integer.valueOf(c0866q0.q()) : null, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        String strS = c0802d1.s();
        if (!c0866q0.v()) {
            hashSet = new HashSet();
            it = c0866q0.s().iterator();
            while (true) {
                if (it.hasNext()) {
                    c1350e = new C1350e(0);
                    it2 = c0802d1.p().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = c0866q0.s().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    zY = zY;
                                    x9 = x9;
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                c0875s0 = (C0875s0) it3.next();
                                if (c0875s0.t()) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                strW = c0875s0.w();
                                if (strW.isEmpty()) {
                                    obj = c1350e.get(strW);
                                    if (obj instanceof Long) {
                                        if (obj instanceof Double) {
                                            if (obj instanceof String) {
                                                zY = zY;
                                                x9 = x9;
                                                if (obj == null) {
                                                    C1023u0.m(x9);
                                                    v11.c(s10.a(strS), s10.b(strW), "Unknown param type. event, param");
                                                    break;
                                                }
                                                C1023u0.m(x9);
                                                v10.c(s10.a(strS), s10.b(strW), "Missing param for filter. event, param");
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (c0875s0.p()) {
                                                if (c0875s0.r()) {
                                                    zY = zY;
                                                    x9 = x9;
                                                    C1023u0.m(x9);
                                                    v11.c(s10.a(strS), s10.b(strW), "No filter for String param. event, param");
                                                    break;
                                                }
                                                str = (String) obj;
                                                if (C0967b0.U(str)) {
                                                    zY = zY;
                                                    x9 = x9;
                                                    C1023u0.m(x9);
                                                    v11.c(s10.a(strS), s10.b(strW), "Invalid param value for number filter. event, param");
                                                    break;
                                                }
                                                c0890v0S = c0875s0.s();
                                                if (C0967b0.U(str)) {
                                                    zY = zY;
                                                    x9 = x9;
                                                    j10 = 0;
                                                    boolE3 = e(new BigDecimal(str), c0890v0S, 0.0d);
                                                } else {
                                                    boolE3 = null;
                                                }
                                                if (boolE3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolE3.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                x9 = x9;
                                                zY = zY;
                                            } else {
                                                C0905y0 c0905y0Q = c0875s0.q();
                                                C1023u0.m(x9);
                                                boolE3 = d((String) obj, c0905y0Q, x9);
                                            }
                                            j10 = 0;
                                            if (boolE3 != null) {
                                                break;
                                                break;
                                            }
                                            if (boolE3.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            x9 = x9;
                                            zY = zY;
                                        } else if (c0875s0.r()) {
                                            double dDoubleValue = ((Double) obj).doubleValue();
                                            boolE2 = e(new BigDecimal(dDoubleValue), c0875s0.s(), Math.ulp(dDoubleValue));
                                            if (boolE2 != null) {
                                                if (boolE2.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        } else {
                                            C1023u0.m(x9);
                                            v11.c(s10.a(strS), s10.b(strW), "No number filter for double param. event, param");
                                        }
                                    } else if (c0875s0.r()) {
                                        boolE = e(new BigDecimal(((Long) obj).longValue()), c0875s0.s(), 0.0d);
                                        if (boolE != null) {
                                            if (boolE.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    } else {
                                        C1023u0.m(x9);
                                        v11.c(s10.a(strS), s10.b(strW), "No number filter for long param. event, param");
                                    }
                                } else {
                                    C1023u0.m(x9);
                                    v11.b(s10.a(strS), "Event has empty param name. event");
                                }
                            }
                        } else {
                            c0817g1 = (C0817g1) it2.next();
                            if (!hashSet.contains(c0817g1.q())) {
                                if (c0817g1.t()) {
                                    String strQ = c0817g1.q();
                                    if (c0817g1.t()) {
                                        lValueOf = Long.valueOf(c0817g1.u());
                                    } else {
                                        lValueOf = null;
                                    }
                                    c1350e.put(strQ, lValueOf);
                                } else if (c0817g1.x()) {
                                    String strQ2 = c0817g1.q();
                                    if (c0817g1.x()) {
                                        dValueOf = Double.valueOf(c0817g1.y());
                                    } else {
                                        dValueOf = null;
                                    }
                                    c1350e.put(strQ2, dValueOf);
                                } else if (c0817g1.r()) {
                                    c1350e.put(c0817g1.q(), c0817g1.s());
                                } else {
                                    C1023u0.m(x9);
                                    v11.c(s10.a(strS), s10.b(c0817g1.q()), "Unknown value for param. event, param");
                                }
                            }
                        }
                    }
                } else {
                    c0875s1 = (C0875s0) it.next();
                    if (c0875s1.w().isEmpty()) {
                        C1023u0.m(x9);
                        v11.b(s10.a(strS), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(c0875s1.w());
                    }
                }
                zY = zY;
                x9 = x9;
                break;
            }
        }
        try {
            boolE4 = e(new BigDecimal(j11), c0866q0.w(), 0.0d);
        } catch (NumberFormatException unused) {
            boolE4 = null;
        }
        if (boolE4 != null) {
            if (boolE4.booleanValue()) {
                hashSet = new HashSet();
                it = c0866q0.s().iterator();
                while (true) {
                    if (it.hasNext()) {
                        c1350e = new C1350e(0);
                        it2 = c0802d1.p().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                it3 = c0866q0.s().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        zY = zY;
                                        x9 = x9;
                                        bool = Boolean.TRUE;
                                        break;
                                    }
                                    c0875s0 = (C0875s0) it3.next();
                                    if (c0875s0.t() || !c0875s0.u()) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    strW = c0875s0.w();
                                    if (strW.isEmpty()) {
                                        obj = c1350e.get(strW);
                                        if (obj instanceof Long) {
                                            if (obj instanceof Double) {
                                                if (obj instanceof String) {
                                                    zY = zY;
                                                    x9 = x9;
                                                    if (obj == null) {
                                                        C1023u0.m(x9);
                                                        v11.c(s10.a(strS), s10.b(strW), "Unknown param type. event, param");
                                                        break;
                                                    }
                                                    C1023u0.m(x9);
                                                    v10.c(s10.a(strS), s10.b(strW), "Missing param for filter. event, param");
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                if (c0875s0.p()) {
                                                    if (c0875s0.r()) {
                                                        zY = zY;
                                                        x9 = x9;
                                                        C1023u0.m(x9);
                                                        v11.c(s10.a(strS), s10.b(strW), "No filter for String param. event, param");
                                                        break;
                                                    }
                                                    str = (String) obj;
                                                    if (C0967b0.U(str)) {
                                                        zY = zY;
                                                        x9 = x9;
                                                        C1023u0.m(x9);
                                                        v11.c(s10.a(strS), s10.b(strW), "Invalid param value for number filter. event, param");
                                                        break;
                                                    }
                                                    c0890v0S = c0875s0.s();
                                                    if (C0967b0.U(str)) {
                                                        boolE3 = null;
                                                    } else {
                                                        try {
                                                            zY = zY;
                                                            x9 = x9;
                                                            j10 = 0;
                                                            try {
                                                                boolE3 = e(new BigDecimal(str), c0890v0S, 0.0d);
                                                            } catch (NumberFormatException unused2) {
                                                                boolE3 = null;
                                                            }
                                                        } catch (NumberFormatException unused3) {
                                                            zY = zY;
                                                            x9 = x9;
                                                            j10 = 0;
                                                        }
                                                    }
                                                    if (boolE3 != null) {
                                                        break;
                                                    }
                                                    if (boolE3.booleanValue() == z11) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    x9 = x9;
                                                    zY = zY;
                                                } else {
                                                    C0905y0 c0905y0Q2 = c0875s0.q();
                                                    C1023u0.m(x9);
                                                    boolE3 = d((String) obj, c0905y0Q2, x9);
                                                }
                                                j10 = 0;
                                                if (boolE3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolE3.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                x9 = x9;
                                                zY = zY;
                                            } else if (c0875s0.r()) {
                                                C1023u0.m(x9);
                                                v11.c(s10.a(strS), s10.b(strW), "No number filter for double param. event, param");
                                            } else {
                                                double dDoubleValue2 = ((Double) obj).doubleValue();
                                                try {
                                                    boolE2 = e(new BigDecimal(dDoubleValue2), c0875s0.s(), Math.ulp(dDoubleValue2));
                                                } catch (NumberFormatException unused4) {
                                                    boolE2 = null;
                                                }
                                                if (boolE2 != null) {
                                                    if (boolE2.booleanValue() == z11) {
                                                        bool = Boolean.FALSE;
                                                    }
                                                }
                                            }
                                        } else if (c0875s0.r()) {
                                            C1023u0.m(x9);
                                            v11.c(s10.a(strS), s10.b(strW), "No number filter for long param. event, param");
                                        } else {
                                            try {
                                                boolE = e(new BigDecimal(((Long) obj).longValue()), c0875s0.s(), 0.0d);
                                            } catch (NumberFormatException unused5) {
                                                boolE = null;
                                            }
                                            if (boolE != null) {
                                                if (boolE.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        }
                                    } else {
                                        C1023u0.m(x9);
                                        v11.b(s10.a(strS), "Event has empty param name. event");
                                    }
                                }
                            } else {
                                c0817g1 = (C0817g1) it2.next();
                                if (!hashSet.contains(c0817g1.q())) {
                                    if (c0817g1.t()) {
                                        String strQ3 = c0817g1.q();
                                        if (c0817g1.t()) {
                                            lValueOf = Long.valueOf(c0817g1.u());
                                        } else {
                                            lValueOf = null;
                                        }
                                        c1350e.put(strQ3, lValueOf);
                                    } else if (c0817g1.x()) {
                                        String strQ4 = c0817g1.q();
                                        if (c0817g1.x()) {
                                            dValueOf = Double.valueOf(c0817g1.y());
                                        } else {
                                            dValueOf = null;
                                        }
                                        c1350e.put(strQ4, dValueOf);
                                    } else if (c0817g1.r()) {
                                        c1350e.put(c0817g1.q(), c0817g1.s());
                                    } else {
                                        C1023u0.m(x9);
                                        v11.c(s10.a(strS), s10.b(c0817g1.q()), "Unknown value for param. event, param");
                                    }
                                }
                            }
                        }
                    } else {
                        c0875s1 = (C0875s0) it.next();
                        if (c0875s1.w().isEmpty()) {
                            C1023u0.m(x9);
                            v11.b(s10.a(strS), "null or empty param name in filter. event");
                        } else {
                            hashSet.add(c0875s1.w());
                        }
                    }
                }
            } else {
                bool = Boolean.FALSE;
            }
        }
        zY = zY;
        x9 = x9;
        break;
        C1023u0.m(x9);
        v10.b(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.f17259c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.f17260d = bool2;
        if (!z12 || !c0802d1.t()) {
            return true;
        }
        Long lValueOf2 = Long.valueOf(c0802d1.u());
        if (c0866q0.y()) {
            if (zY && c0866q0.v()) {
                lValueOf2 = l10;
            }
            this.f17262f = lValueOf2;
            return true;
        }
        if (zY && c0866q0.v()) {
            lValueOf2 = l11;
        }
        this.f17261e = lValueOf2;
        return true;
    }

    public boolean b(Long l10, Long l11, C0886u1 c0886u1, boolean z10) {
        boolean z11;
        Boolean boolC;
        Boolean boolE;
        Boolean boolE2;
        Boolean boolE3;
        C0898w3.a();
        C1023u0 c1023u0 = (C1023u0) this.f17263h.f16104r;
        C0981g c0981g = c1023u0.f17582u;
        S s10 = c1023u0.f17563A;
        X x9 = c1023u0.f17584w;
        boolean zY = c0981g.y(this.f17257a, G.f16891E0);
        C0900x0 c0900x0 = (C0900x0) this.f17264i;
        boolean zT = c0900x0.t();
        boolean zU = c0900x0.u();
        boolean zW = c0900x0.w();
        boolean z12 = zT || zU || zW;
        if (z10 && !z12) {
            C1023u0.m(x9);
            x9.f17178E.c(Integer.valueOf(this.f17258b), c0900x0.p() ? Integer.valueOf(c0900x0.q()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        C0875s0 c0875s0S = c0900x0.s();
        boolean zU2 = c0875s0S.u();
        if (!c0886u1.u()) {
            z11 = zW;
            if (!c0886u1.y()) {
                if (!c0886u1.s()) {
                    C1023u0.m(x9);
                    x9.f17185z.b(s10.c(c0886u1.r()), "User property has no value, property");
                } else if (c0875s0S.p()) {
                    String strT = c0886u1.t();
                    C0905y0 c0905y0Q = c0875s0S.q();
                    C1023u0.m(x9);
                    boolC = c(d(strT, c0905y0Q, x9), zU2);
                } else if (!c0875s0S.r()) {
                    C1023u0.m(x9);
                    x9.f17185z.b(s10.c(c0886u1.r()), "No string or number filter defined. property");
                } else if (C0967b0.U(c0886u1.t())) {
                    String strT2 = c0886u1.t();
                    C0890v0 c0890v0S = c0875s0S.s();
                    if (C0967b0.U(strT2)) {
                        try {
                            boolE = e(new BigDecimal(strT2), c0890v0S, 0.0d);
                        } catch (NumberFormatException unused) {
                            boolE = null;
                        }
                    } else {
                        boolE = null;
                    }
                    boolC = c(boolE, zU2);
                } else {
                    C1023u0.m(x9);
                    x9.f17185z.c(s10.c(c0886u1.r()), c0886u1.t(), "Invalid user property value for Numeric number filter. property, value");
                }
                boolC = null;
            } else if (c0875s0S.r()) {
                double dZ = c0886u1.z();
                try {
                    boolE2 = e(new BigDecimal(dZ), c0875s0S.s(), Math.ulp(dZ));
                } catch (NumberFormatException unused2) {
                    boolE2 = null;
                }
                boolC = c(boolE2, zU2);
            } else {
                C1023u0.m(x9);
                x9.f17185z.b(s10.c(c0886u1.r()), "No number filter for double property. property");
                boolC = null;
            }
        } else if (c0875s0S.r()) {
            z11 = zW;
            try {
                boolE3 = e(new BigDecimal(c0886u1.v()), c0875s0S.s(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolE3 = null;
            }
            boolC = c(boolE3, zU2);
        } else {
            C1023u0.m(x9);
            x9.f17185z.b(s10.c(c0886u1.r()), "No number filter for long property. property");
            z11 = zW;
            boolC = null;
        }
        C1023u0.m(x9);
        x9.f17178E.b(boolC == null ? "null" : boolC, "Property filter result");
        if (boolC == null) {
            return false;
        }
        this.f17259c = Boolean.TRUE;
        if (!z11 || boolC.booleanValue()) {
            if (!z10 || c0900x0.t()) {
                this.f17260d = boolC;
            }
            if (boolC.booleanValue() && z12 && c0886u1.p()) {
                long jQ = c0886u1.q();
                if (l10 != null) {
                    jQ = l10.longValue();
                }
                if (zY && c0900x0.t() && !c0900x0.u() && l11 != null) {
                    jQ = l11.longValue();
                }
                if (c0900x0.u()) {
                    this.f17262f = Long.valueOf(jQ);
                } else {
                    this.f17261e = Long.valueOf(jQ);
                }
            }
        }
        return true;
    }
}
