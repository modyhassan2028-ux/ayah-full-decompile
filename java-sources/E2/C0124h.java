package E2;

import A.o1;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: E2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0124h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Serializable f1676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1677f;

    public C0124h(p173r2.x xVar) {
        this.f1672a = 2;
        this.f1674c = xVar;
        this.f1675d = new u.P(0);
    }

    public static /* synthetic */ void p(C0124h c0124h, String str, int i10, String str2, int i11) {
        if ((i11 & 2) != 0) {
            i10 = c0124h.f1673b;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        c0124h.o(i10, str, str2);
        throw null;
    }

    public void A(View view) {
        ((ArrayList) this.f1676e).add(view);
        C0111a0 c0111a0 = (C0111a0) this.f1674c;
        F0 f0P = RecyclerView.P(view);
        if (f0P != null) {
            View view2 = f0P.f1486a;
            RecyclerView recyclerView = c0111a0.f1640a;
            int i10 = f0P.f1500q;
            if (i10 != -1) {
                f0P.f1499p = i10;
            } else {
                f0P.f1499p = view2.getImportantForAccessibility();
            }
            if (!recyclerView.T()) {
                view2.setImportantForAccessibility(4);
            } else {
                f0P.f1500q = 4;
                recyclerView.L0.add(f0P);
            }
        }
    }

    public p173r2.u B(p173r2.u uVar, p074h0.i iVar, boolean z10, p173r2.v vVar) {
        p173r2.u uVarE;
        p173r2.x xVar = (p173r2.x) this.f1674c;
        ArrayList arrayList = new ArrayList();
        Iterator it = xVar.iterator();
        while (true) {
            p197u2.j jVar = (p197u2.j) it;
            uVarE = null;
            if (!jVar.hasNext()) {
                break;
            }
            p173r2.v vVar2 = (p173r2.v) jVar.next();
            uVarE = p251z9.j.a(vVar2, vVar) ? null : vVar2.d(iVar);
            if (uVarE != null) {
                arrayList.add(uVarE);
            }
        }
        p173r2.u uVar2 = (p173r2.u) p120l9.m.o0(arrayList);
        p173r2.x xVar2 = xVar.f21494t;
        if (xVar2 != null && z10 && !xVar2.equals(vVar)) {
            uVarE = xVar2.e(iVar, xVar);
        }
        return (p173r2.u) p120l9.m.o0(p120l9.l.i0(new p173r2.u[]{uVar, uVar2, uVarE}));
    }

    public String C(String str) {
        p251z9.j.e(str, "keyToMatch");
        int i10 = this.f1673b;
        try {
            if (g() == 6 && p251z9.j.a(E(), str)) {
                this.f1675d = null;
                if (g() == 5) {
                    return E();
                }
            }
            return null;
        } finally {
            this.f1673b = i10;
            this.f1675d = null;
        }
    }

    public byte D() {
        String str = (String) this.f1677f;
        int i10 = this.f1673b;
        while (true) {
            int iF = F(i10);
            if (iF == -1) {
                this.f1673b = iF;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iF);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f1673b = iF;
                return p009aa.i.d(cCharAt);
            }
            i10 = iF + 1;
        }
    }

    public String E() {
        if (D() != 1) {
            return null;
        }
        String strK = k();
        this.f1675d = strK;
        return strK;
    }

    public int F(int i10) {
        if (i10 < ((String) this.f1677f).length()) {
            return i10;
        }
        return -1;
    }

    public int G() {
        char cCharAt;
        int i10 = this.f1673b;
        if (i10 == -1) {
            return i10;
        }
        String str = (String) this.f1677f;
        while (i10 < str.length() && ((cCharAt = str.charAt(i10)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i10++;
        }
        this.f1673b = i10;
        return i10;
    }

    public boolean H() {
        int iG = G();
        String str = (String) this.f1677f;
        if (iG >= str.length() || iG == -1 || str.charAt(iG) != ',') {
            return false;
        }
        this.f1673b++;
        return true;
    }

    public void I(char c10) {
        int i10 = this.f1673b;
        if (i10 > 0 && c10 == '\"') {
            try {
                this.f1673b = i10 - 1;
                String strL = l();
                this.f1673b = i10;
                if (p251z9.j.a(strL, "null")) {
                    o(this.f1673b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f1673b = i10;
                throw th;
            }
        }
        q(p009aa.i.d(c10), true);
        throw null;
    }

    public void J(View view) {
        if (((ArrayList) this.f1676e).remove(view)) {
            C0111a0 c0111a0 = (C0111a0) this.f1674c;
            F0 f0P = RecyclerView.P(view);
            if (f0P != null) {
                RecyclerView recyclerView = c0111a0.f1640a;
                int i10 = f0P.f1499p;
                if (recyclerView.T()) {
                    f0P.f1500q = i10;
                    recyclerView.L0.add(f0P);
                } else {
                    f0P.f1486a.setImportantForAccessibility(i10);
                }
                f0P.f1499p = 0;
            }
        }
    }

    public void a(View view, int i10, boolean z10) {
        RecyclerView recyclerView = ((C0111a0) this.f1674c).f1640a;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : x(i10);
        ((o1) this.f1675d).f(childCount, z10);
        if (z10) {
            A(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.P(view);
        ArrayList arrayList = recyclerView.T;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC0139o0) recyclerView.T.get(size)).b(view);
            }
        }
    }

    public int b(CharSequence charSequence, int i10) {
        int i11 = i10 + 4;
        if (i11 < charSequence.length()) {
            ((StringBuilder) this.f1676e).append((char) (u(charSequence, i10 + 3) + (u(charSequence, i10) << 12) + (u(charSequence, i10 + 1) << 8) + (u(charSequence, i10 + 2) << 4)));
            return i11;
        }
        this.f1673b = i10;
        if (i11 < charSequence.length()) {
            return b(charSequence, this.f1673b);
        }
        p(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        RecyclerView recyclerView = ((C0111a0) this.f1674c).f1640a;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : x(i10);
        ((o1) this.f1675d).f(childCount, z10);
        if (z10) {
            A(view);
        }
        F0 f0P = RecyclerView.P(view);
        if (f0P != null) {
            if (!f0P.k() && !f0P.p()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(f0P);
                throw new IllegalArgumentException(p245z2.a.C(recyclerView, sb));
            }
            if (RecyclerView.f12847U0) {
                Log.d("RecyclerView", "reAttach " + f0P);
            }
            f0P.j &= -257;
        } else if (RecyclerView.f12846T0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(p245z2.a.C(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public boolean d() {
        int i10 = this.f1673b;
        if (i10 == -1) {
            return false;
        }
        String str = (String) this.f1677f;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1673b = i10;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i10++;
        }
        this.f1673b = i10;
        return false;
    }

    public void e(int i10, String str) {
        String str2 = (String) this.f1677f;
        if (str2.length() - i10 < str.length()) {
            p(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != (str2.charAt(i10 + i11) | ' ')) {
                p(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f1673b = str.length() + i10;
    }

    public String f() {
        StringBuilder sb = (StringBuilder) this.f1676e;
        String str = (String) this.f1677f;
        i('\"');
        int i10 = this.f1673b;
        int iB1 = H9.o.b1(str, '\"', i10, 4);
        if (iB1 == -1) {
            l();
            q((byte) 1, false);
            throw null;
        }
        int i11 = i10;
        while (i11 < iB1) {
            if (str.charAt(i11) == '\\') {
                int iF = this.f1673b;
                char cCharAt = str.charAt(i11);
                boolean z10 = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iF, i11);
                        int iF2 = F(i11 + 1);
                        if (iF2 == -1) {
                            p(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iB = iF2 + 1;
                        char cCharAt2 = str.charAt(iF2);
                        if (cCharAt2 == 'u') {
                            iB = b(str, iB);
                        } else {
                            char c10 = cCharAt2 < 'u' ? p009aa.c.f11235a[cCharAt2] : (char) 0;
                            if (c10 == 0) {
                                p(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c10);
                        }
                        iF = F(iB);
                        if (iF == -1) {
                            p(this, "Unexpected EOF", iF, null, 4);
                            throw null;
                        }
                    } else {
                        i11++;
                        if (i11 >= str.length()) {
                            sb.append((CharSequence) str, iF, i11);
                            iF = F(i11);
                            if (iF == -1) {
                                p(this, "Unexpected EOF", iF, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i11);
                    }
                    i11 = iF;
                    z10 = true;
                    cCharAt = str.charAt(i11);
                }
                String string = !z10 ? str.subSequence(iF, i11).toString() : m(iF, i11);
                this.f1673b = i11 + 1;
                return string;
            }
            i11++;
        }
        this.f1673b = iB1 + 1;
        String strSubstring = str.substring(i10, iB1);
        p251z9.j.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public byte g() {
        String str = (String) this.f1677f;
        int i10 = this.f1673b;
        while (i10 != -1 && i10 < str.length()) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1673b = i11;
                return p009aa.i.d(cCharAt);
            }
            i10 = i11;
        }
        this.f1673b = str.length();
        return (byte) 10;
    }

    public byte h(byte b5) {
        byte bG = g();
        if (bG == b5) {
            return bG;
        }
        q(b5, true);
        throw null;
    }

    public void i(char c10) {
        int i10 = this.f1673b;
        if (i10 == -1) {
            I(c10);
            throw null;
        }
        String str = (String) this.f1677f;
        while (i10 < str.length()) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1673b = i11;
                if (cCharAt == c10) {
                    return;
                }
                I(c10);
                throw null;
            }
            i10 = i11;
        }
        this.f1673b = -1;
        I(c10);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public long j() {
        boolean z10;
        boolean z11;
        long j;
        double dPow;
        int iF = F(G());
        String str = (String) this.f1677f;
        ?? r10 = 0;
        if (iF >= str.length() || iF == -1) {
            p(this, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iF) == '\"') {
            iF++;
            if (iF == str.length()) {
                p(this, "EOF", 0, null, 6);
                throw null;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = iF;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        long j10 = 0;
        long j11 = 0;
        while (true) {
            if (i10 == str.length()) {
                z11 = z10;
                break;
            }
            char cCharAt = str.charAt(i10);
            if ((cCharAt != 'e' && cCharAt != 'E') || z13) {
                if (cCharAt == '-' && z13) {
                    if (i10 == iF) {
                        p(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i10++;
                    z12 = false;
                } else if (cCharAt != '+' || !z13) {
                    z11 = z10;
                    if (cCharAt != '-') {
                        if (p009aa.i.d(cCharAt) != 0) {
                            break;
                        }
                        i10++;
                        int i11 = cCharAt - '0';
                        if (i11 < 0 || i11 >= 10) {
                            p(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        if (z13) {
                            j10 = (j10 * ((long) 10)) + ((long) i11);
                        } else {
                            j11 = (j11 * ((long) 10)) - ((long) i11);
                            if (j11 > 0) {
                                p(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        }
                        z10 = z11;
                    } else {
                        if (i10 != iF) {
                            p(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        i10++;
                        z10 = z11;
                        r10 = 0;
                        z14 = true;
                    }
                } else {
                    if (i10 == iF) {
                        p(this, "Unexpected symbol '+' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i10++;
                    r10 = 0;
                    z12 = true;
                }
                r10 = 0;
            } else {
                if (i10 == iF) {
                    p(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, r10, 6);
                    throw r10;
                }
                i10++;
                z12 = true;
                z13 = true;
            }
        }
        boolean z15 = i10 != iF;
        if (iF == i10 || (z14 && iF == i10 - 1)) {
            p(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        if (z11) {
            if (!z15) {
                p(this, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(i10) != '\"') {
                p(this, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            i10++;
        }
        this.f1673b = i10;
        long j12 = j11;
        if (z13) {
            double d5 = j12;
            if (!z12) {
                dPow = Math.pow(10.0d, -j10);
            } else {
                if (!z12) {
                    throw new A6.a();
                }
                dPow = Math.pow(10.0d, j10);
            }
            double d9 = d5 * dPow;
            if (d9 > 9.223372036854776E18d || d9 < -9.223372036854776E18d) {
                p(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d9) != d9) {
                p(this, "Can't convert " + d9 + " to Long", 0, null, 6);
                throw null;
            }
            j = (long) d9;
        } else {
            j = j12;
        }
        if (z14) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        p(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public String k() {
        String str = (String) this.f1675d;
        if (str == null) {
            return f();
        }
        p251z9.j.b(str);
        this.f1675d = null;
        return str;
    }

    public String l() {
        String str = (String) this.f1677f;
        String str2 = (String) this.f1675d;
        if (str2 != null) {
            p251z9.j.b(str2);
            this.f1675d = null;
            return str2;
        }
        int iG = G();
        if (iG >= str.length() || iG == -1) {
            p(this, "EOF", iG, null, 4);
            throw null;
        }
        byte bD = p009aa.i.d(str.charAt(iG));
        if (bD == 1) {
            return k();
        }
        if (bD != 0) {
            p(this, "Expected beginning of the string, but got " + str.charAt(iG), 0, null, 6);
            throw null;
        }
        boolean z10 = false;
        while (p009aa.i.d(str.charAt(iG)) == 0) {
            iG++;
            if (iG >= str.length()) {
                ((StringBuilder) this.f1676e).append((CharSequence) str, this.f1673b, iG);
                int iF = F(iG);
                if (iF == -1) {
                    this.f1673b = iG;
                    return m(0, 0);
                }
                iG = iF;
                z10 = true;
            }
        }
        String string = !z10 ? str.subSequence(this.f1673b, iG).toString() : m(this.f1673b, iG);
        this.f1673b = iG;
        return string;
    }

    public String m(int i10, int i11) {
        StringBuilder sb = (StringBuilder) this.f1676e;
        sb.append((CharSequence) this.f1677f, i10, i11);
        String string = sb.toString();
        p251z9.j.d(string, "toString(...)");
        sb.setLength(0);
        return string;
    }

    public void n(int i10) {
        int iX = x(i10);
        ((o1) this.f1675d).j(iX);
        RecyclerView recyclerView = ((C0111a0) this.f1674c).f1640a;
        View childAt = recyclerView.getChildAt(iX);
        if (childAt != null) {
            F0 f0P = RecyclerView.P(childAt);
            if (f0P != null) {
                if (f0P.k() && !f0P.p()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(f0P);
                    throw new IllegalArgumentException(p245z2.a.C(recyclerView, sb));
                }
                if (RecyclerView.f12847U0) {
                    Log.d("RecyclerView", "tmpDetach " + f0P);
                }
                f0P.a(256);
            }
        } else if (RecyclerView.f12846T0) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(iX);
            throw new IllegalArgumentException(p245z2.a.C(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(iX);
    }

    public void o(int i10, String str, String str2) {
        p251z9.j.e(str, "message");
        p251z9.j.e(str2, "hint");
        throw p009aa.i.b(str + " at path: " + ((G.a0) this.f1674c).g() + (str2.length() == 0 ? "" : "\n".concat(str2)), (String) this.f1677f, i10);
    }

    public void q(byte b5, boolean z10) {
        String str = (String) this.f1677f;
        String strK = p009aa.i.k(b5);
        int i10 = z10 ? this.f1673b - 1 : this.f1673b;
        p(this, p123m2.c.t("Expected ", strK, ", but had '", (this.f1673b == str.length() || i10 < 0) ? "EOF" : String.valueOf(str.charAt(i10)), "' instead"), i10, null, 4);
        throw null;
    }

    public p173r2.v r(int i10) {
        return t(i10, (p173r2.x) this.f1674c, null, false);
    }

    public p173r2.v s(String str, boolean z10) {
        Object next;
        p173r2.x xVar;
        p173r2.v vVar;
        boolean zEquals;
        p251z9.j.e(str, "route");
        u.P p10 = (u.P) this.f1675d;
        p251z9.j.e(p10, "<this>");
        Iterator it = ((G9.a) G9.k.a0(new I1.V(6, p10))).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            vVar = (p173r2.v) next;
            String str2 = (String) vVar.f21493s.f1645e;
            if (str2 == null) {
                zEquals = str == null;
            } else {
                zEquals = str2.equals(str);
            }
            if (zEquals) {
                break;
            }
        } while (vVar.f21493s.m(str) == null);
        p173r2.v vVar2 = (p173r2.v) next;
        if (vVar2 != null) {
            return vVar2;
        }
        if (!z10 || (xVar = ((p173r2.x) this.f1674c).f21494t) == null) {
            return null;
        }
        C0124h c0124h = xVar.f21502w;
        c0124h.getClass();
        if (H9.o.e1(str)) {
            return null;
        }
        return c0124h.s(str, true);
    }

    public p173r2.v t(int i10, p173r2.v vVar, p173r2.v vVar2, boolean z10) {
        p173r2.x xVar = (p173r2.x) this.f1674c;
        u.P p10 = (u.P) this.f1675d;
        p173r2.v vVarT = (p173r2.v) p10.d(i10);
        if (vVar2 != null) {
            if (p251z9.j.a(vVarT, vVar2) && p251z9.j.a(vVarT.f21494t, vVar2.f21494t)) {
                return vVarT;
            }
            vVarT = null;
        } else if (vVarT != null) {
            return vVarT;
        }
        if (z10) {
            Iterator it = ((G9.a) G9.k.a0(new I1.V(6, p10))).iterator();
            do {
                if (!it.hasNext()) {
                    vVarT = null;
                    break;
                }
                p173r2.v vVar3 = (p173r2.v) it.next();
                vVarT = (!(vVar3 instanceof p173r2.x) || vVar3.equals(vVar)) ? null : ((p173r2.x) vVar3).f21502w.t(i10, xVar, vVar2, true);
            } while (vVarT == null);
        }
        if (vVarT != null) {
            return vVarT;
        }
        p173r2.x xVar2 = xVar.f21494t;
        if (xVar2 == null || xVar2.equals(vVar)) {
            return null;
        }
        p173r2.x xVar3 = xVar.f21494t;
        p251z9.j.b(xVar3);
        return xVar3.f21502w.t(i10, xVar, vVar2, z10);
    }

    public String toString() {
        switch (this.f1672a) {
            case 0:
                return ((o1) this.f1675d).toString() + ", hidden list:" + ((ArrayList) this.f1676e).size();
            case 1:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f1677f);
                sb.append("', currentPosition=");
                return android.support.v4.media.session.p.A(sb, this.f1673b, ')');
            default:
                return super.toString();
        }
    }

    public int u(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        p(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public View v(int i10) {
        return ((C0111a0) this.f1674c).f1640a.getChildAt(x(i10));
    }

    public int w() {
        return ((C0111a0) this.f1674c).f1640a.getChildCount() - ((ArrayList) this.f1676e).size();
    }

    public int x(int i10) {
        o1 o1Var = (o1) this.f1675d;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((C0111a0) this.f1674c).f1640a.getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int iC = i10 - (i11 - o1Var.c(i11));
            if (iC == 0) {
                while (o1Var.e(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iC;
        }
        return -1;
    }

    public View y(int i10) {
        return ((C0111a0) this.f1674c).f1640a.getChildAt(i10);
    }

    public int z() {
        return ((C0111a0) this.f1674c).f1640a.getChildCount();
    }

    public C0124h(C0111a0 c0111a0) {
        this.f1672a = 0;
        this.f1673b = 0;
        this.f1674c = c0111a0;
        this.f1675d = new o1();
        this.f1676e = new ArrayList();
    }

    public C0124h(String str) {
        this.f1672a = 1;
        p251z9.j.e(str, "source");
        G.a0 a0Var = new G.a0(4, (byte) 0);
        a0Var.f2655c = new Object[8];
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        a0Var.f2656d = iArr;
        a0Var.f2654b = -1;
        this.f1674c = a0Var;
        this.f1676e = new StringBuilder();
        this.f1677f = str;
    }
}
