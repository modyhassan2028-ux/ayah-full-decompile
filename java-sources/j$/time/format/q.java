package j$.time.format;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements InterfaceC1057e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TemporalField f17898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextStyle f17899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f17900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile i f17901d;

    public q(TemporalField temporalField, TextStyle textStyle, B b5) {
        this.f17898a = temporalField;
        this.f17899b = textStyle;
        this.f17900c = b5;
    }

    @Override // j$.time.format.InterfaceC1057e
    public final boolean k(y yVar, StringBuilder sb) {
        String strC;
        Long lA = yVar.a(this.f17898a);
        DateTimeFormatter dateTimeFormatter = yVar.f17929b;
        if (lA == null) {
            return false;
        }
        j$.time.chrono.l lVar = (j$.time.chrono.l) yVar.f17928a.v(j$.time.temporal.n.f17980b);
        if (lVar == null || lVar == j$.time.chrono.q.f17812c) {
            strC = this.f17900c.c(this.f17898a, lA.longValue(), this.f17899b, dateTimeFormatter.f17850b);
        } else {
            strC = this.f17900c.b(lVar, this.f17898a, lA.longValue(), this.f17899b, dateTimeFormatter.f17850b);
        }
        if (strC != null) {
            sb.append(strC);
            return true;
        }
        if (this.f17901d == null) {
            this.f17901d = new i(this.f17898a, 1, 19, F.NORMAL);
        }
        return this.f17901d.k(yVar, sb);
    }

    @Override // j$.time.format.InterfaceC1057e
    public final int l(v vVar, CharSequence charSequence, int i10) {
        Iterator itE;
        B b5 = this.f17900c;
        TemporalField temporalField = this.f17898a;
        int length = charSequence.length();
        if (i10 >= 0 && i10 <= length) {
            boolean z10 = vVar.f17921c;
            DateTimeFormatter dateTimeFormatter = vVar.f17919a;
            TextStyle textStyle = z10 ? this.f17899b : null;
            j$.time.chrono.l lVar = vVar.c().f17843c;
            if (lVar == null && (lVar = vVar.f17919a.f17853e) == null) {
                lVar = j$.time.chrono.q.f17812c;
            }
            j$.time.chrono.l lVar2 = lVar;
            if (lVar2 == null || lVar2 == j$.time.chrono.q.f17812c) {
                itE = b5.e(temporalField, textStyle, dateTimeFormatter.f17850b);
            } else {
                itE = b5.d(lVar2, temporalField, textStyle, dateTimeFormatter.f17850b);
            }
            Iterator it = itE;
            if (it != null) {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    if (vVar.g(str, 0, charSequence, i10, str.length())) {
                        return vVar.f(this.f17898a, ((Long) entry.getValue()).longValue(), i10, str.length() + i10);
                    }
                }
                if (temporalField == ChronoField.ERA && !vVar.f17921c) {
                    for (j$.time.chrono.m mVar : lVar2.u()) {
                        String string = mVar.toString();
                        if (vVar.g(string, 0, charSequence, i10, string.length())) {
                            return vVar.f(this.f17898a, mVar.getValue(), i10, string.length() + i10);
                        }
                    }
                }
                if (vVar.f17921c) {
                    return ~i10;
                }
            }
            if (this.f17901d == null) {
                this.f17901d = new i(this.f17898a, 1, 19, F.NORMAL);
            }
            return this.f17901d.l(vVar, charSequence, i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        TemporalField temporalField = this.f17898a;
        TextStyle textStyle2 = this.f17899b;
        if (textStyle2 == textStyle) {
            return "Text(" + temporalField + ")";
        }
        return "Text(" + temporalField + "," + textStyle2 + ")";
    }
}
