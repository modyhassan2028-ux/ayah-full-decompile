package W0;

import E2.A;
import V0.i;
import X7.m;
import android.content.res.TypedArray;
import android.util.SparseArray;
import java.text.BreakIterator;
import java.util.Locale;
import p013b2.j;
import p120l9.l;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f9493e;

    public /* synthetic */ e() {
        this.f9489a = 2;
    }

    public void a(int i10) {
        int i11 = this.f9490b;
        int i12 = this.f9491c;
        boolean z10 = false;
        if (i10 <= i12 && i11 <= i10) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbX = p123m2.c.x("Invalid offset: ", i10, ". Valid range is [", i11, " , ");
        sbX.append(i12);
        sbX.append(']');
        p002a1.a.a(sbX.toString());
    }

    public int b() {
        A a9 = (A) this.f9493e;
        if (a9 == null) {
            return ((String) this.f9492d).length();
        }
        return (a9.f1434b - a9.f()) + (((String) this.f9492d).length() - (this.f9491c - this.f9490b));
    }

    public boolean c(int i10) {
        CharSequence charSequence = (CharSequence) this.f9492d;
        int i11 = this.f9490b + 1;
        if (i10 > this.f9491c || i11 > i10) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i10))) {
            int i12 = i10 - 1;
            if (!Character.isSurrogate(charSequence.charAt(i12))) {
                if (!j.d()) {
                    return false;
                }
                j jVarA = j.a();
                if (jVarA.c() != 1 || jVarA.b(charSequence, i12) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean d(int i10) {
        int i11 = this.f9490b + 1;
        if (i10 > this.f9491c || i11 > i10) {
            return false;
        }
        return p050e8.b.H(Character.codePointBefore((CharSequence) this.f9492d, i10));
    }

    public boolean e(int i10) {
        a(i10);
        if (!((BreakIterator) this.f9493e).isBoundary(i10)) {
            return false;
        }
        if (g(i10) && g(i10 - 1) && g(i10 + 1)) {
            return false;
        }
        return i10 <= 0 || i10 >= ((CharSequence) this.f9492d).length() - 1 || !(f(i10) || f(i10 + 1));
    }

    public boolean f(int i10) {
        CharSequence charSequence = (CharSequence) this.f9492d;
        int i11 = i10 - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i11));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (p251z9.j.a(unicodeBlockOf, unicodeBlock) && p251z9.j.a(Character.UnicodeBlock.of(charSequence.charAt(i10)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return p251z9.j.a(Character.UnicodeBlock.of(charSequence.charAt(i10)), unicodeBlock) && p251z9.j.a(Character.UnicodeBlock.of(charSequence.charAt(i11)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean g(int i10) {
        CharSequence charSequence = (CharSequence) this.f9492d;
        int i11 = this.f9490b;
        if (i10 >= this.f9491c || i11 > i10) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i10)) && !Character.isSurrogate(charSequence.charAt(i10))) {
            if (!j.d()) {
                return false;
            }
            j jVarA = j.a();
            if (jVarA.c() != 1 || jVarA.b(charSequence, i10) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean h(int i10) {
        int i11 = this.f9490b;
        if (i10 >= this.f9491c || i11 > i10) {
            return false;
        }
        return p050e8.b.H(Character.codePointAt((CharSequence) this.f9492d, i10));
    }

    public int i(int i10) {
        a(i10);
        int iFollowing = ((BreakIterator) this.f9493e).following(i10);
        return (g(iFollowing + (-1)) && g(iFollowing) && !f(iFollowing)) ? i(iFollowing) : iFollowing;
    }

    public int j(int i10) {
        a(i10);
        int iPreceding = ((BreakIterator) this.f9493e).preceding(i10);
        return (g(iPreceding) && c(iPreceding) && !f(iPreceding)) ? j(iPreceding) : iPreceding;
    }

    public void k(String str, int i10, int i11) {
        if (i10 > i11) {
            p002a1.a.a("start index must be less than or equal to end index: " + i10 + " > " + i11);
        }
        if (i10 < 0) {
            p002a1.a.a("start must be non-negative, but was " + i10);
        }
        A a9 = (A) this.f9493e;
        if (a9 == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i10, 64);
            int iMin2 = Math.min(((String) this.f9492d).length() - i11, 64);
            String str2 = (String) this.f9492d;
            int i12 = i10 - iMin;
            p251z9.j.c(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i12, i10, cArr, 0);
            String str3 = (String) this.f9492d;
            int i13 = iMax - iMin2;
            int i14 = iMin2 + i11;
            p251z9.j.c(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i11, i14, cArr, i13);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            A a10 = new A(2);
            a10.f1434b = iMax;
            a10.f1437e = cArr;
            a10.f1435c = length;
            a10.f1436d = i13;
            this.f9493e = a10;
            this.f9490b = i12;
            this.f9491c = i14;
            return;
        }
        int i15 = this.f9490b;
        int i16 = i10 - i15;
        int i17 = i11 - i15;
        if (i16 < 0 || i17 > a9.f1434b - a9.f()) {
            this.f9492d = toString();
            this.f9493e = null;
            this.f9490b = -1;
            this.f9491c = -1;
            k(str, i10, i11);
            return;
        }
        int length2 = str.length() - (i17 - i16);
        if (length2 > a9.f()) {
            int iF = length2 - a9.f();
            int i18 = a9.f1434b;
            do {
                i18 *= 2;
            } while (i18 - a9.f1434b < iF);
            char[] cArr2 = new char[i18];
            l.Y((char[]) a9.f1437e, cArr2, 0, 0, a9.f1435c);
            int i19 = a9.f1434b;
            int i20 = a9.f1436d;
            int i21 = i19 - i20;
            int i22 = i18 - i21;
            l.Y((char[]) a9.f1437e, cArr2, i22, i20, i21 + i20);
            a9.f1437e = cArr2;
            a9.f1434b = i18;
            a9.f1436d = i22;
        }
        int i23 = a9.f1435c;
        if (i16 < i23 && i17 <= i23) {
            int i24 = i23 - i17;
            char[] cArr3 = (char[]) a9.f1437e;
            l.Y(cArr3, cArr3, a9.f1436d - i24, i17, i23);
            a9.f1435c = i16;
            a9.f1436d -= i24;
        } else if (i16 >= i23 || i17 < i23) {
            int iF2 = a9.f() + i16;
            int iF3 = a9.f() + i17;
            int i25 = a9.f1436d;
            char[] cArr4 = (char[]) a9.f1437e;
            l.Y(cArr4, cArr4, a9.f1435c, i25, iF2);
            a9.f1435c += iF2 - i25;
            a9.f1436d = iF3;
        } else {
            a9.f1436d = a9.f() + i17;
            a9.f1435c = i16;
        }
        str.getChars(0, str.length(), (char[]) a9.f1437e, a9.f1435c);
        a9.f1435c = str.length() + a9.f1435c;
    }

    public String toString() {
        switch (this.f9489a) {
            case 2:
                A a9 = (A) this.f9493e;
                if (a9 == null) {
                    return (String) this.f9492d;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) this.f9492d, 0, this.f9490b);
                sb.append((char[]) a9.f1437e, 0, a9.f1435c);
                char[] cArr = (char[]) a9.f1437e;
                int i10 = a9.f1436d;
                sb.append(cArr, i10, a9.f1434b - i10);
                String str = (String) this.f9492d;
                sb.append((CharSequence) str, this.f9491c, str.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public e(CharSequence charSequence, int i10, Locale locale) {
        this.f9489a = 0;
        this.f9492d = charSequence;
        if (charSequence.length() < 0) {
            p002a1.a.a("input start index is outside the CharSequence");
        }
        if (i10 < 0 || i10 > charSequence.length()) {
            p002a1.a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f9493e = wordInstance;
        this.f9490b = Math.max(0, -50);
        this.f9491c = Math.min(charSequence.length(), i10 + 50);
        wordInstance.setText(new i(charSequence, i10));
    }

    public e(m mVar, p074h0.i iVar) {
        this.f9489a = 1;
        this.f9492d = new SparseArray();
        this.f9493e = mVar;
        TypedArray typedArray = (TypedArray) iVar.f16423t;
        this.f9490b = typedArray.getResourceId(28, 0);
        this.f9491c = typedArray.getResourceId(52, 0);
    }
}
