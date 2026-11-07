package j$.time.format;

import java.text.ParsePosition;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f17886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char f17888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f17889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f17890e;

    public boolean b(char c10, char c11) {
        return c10 == c11;
    }

    public m(String str, String str2, m mVar) {
        this.f17886a = str;
        this.f17887b = str2;
        this.f17889d = mVar;
        if (str.isEmpty()) {
            this.f17888c = (char) 65535;
        } else {
            this.f17888c = this.f17886a.charAt(0);
        }
    }

    public final String c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!e(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f17886a.length() + index;
        m mVar = this.f17889d;
        if (mVar != null && length2 != length) {
            while (!b(mVar.f17888c, charSequence.charAt(length2))) {
                mVar = mVar.f17890e;
                if (mVar == null) {
                }
            }
            parsePosition.setIndex(length2);
            String strC = mVar.c(charSequence, parsePosition);
            if (strC != null) {
                return strC;
            }
        }
        parsePosition.setIndex(length2);
        return this.f17887b;
    }

    public m d(String str, String str2, m mVar) {
        return new m(str, str2, mVar);
    }

    public boolean e(CharSequence charSequence, int i10, int i11) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f17886a, i10);
        }
        int length = this.f17886a.length();
        if (length > i11 - i10) {
            return false;
        }
        int i12 = 0;
        while (true) {
            int i13 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i14 = i12 + 1;
            int i15 = i10 + 1;
            if (!b(this.f17886a.charAt(i12), charSequence.charAt(i10))) {
                return false;
            }
            i10 = i15;
            length = i13;
            i12 = i14;
        }
    }

    public final boolean a(String str, String str2) {
        int i10 = 0;
        while (i10 < str.length() && i10 < this.f17886a.length() && b(str.charAt(i10), this.f17886a.charAt(i10))) {
            i10++;
        }
        if (i10 == this.f17886a.length()) {
            if (i10 < str.length()) {
                String strSubstring = str.substring(i10);
                for (m mVar = this.f17889d; mVar != null; mVar = mVar.f17890e) {
                    if (b(mVar.f17888c, strSubstring.charAt(0))) {
                        return mVar.a(strSubstring, str2);
                    }
                }
                m mVarD = d(strSubstring, str2, null);
                mVarD.f17890e = this.f17889d;
                this.f17889d = mVarD;
                return true;
            }
            this.f17887b = str2;
            return true;
        }
        m mVarD2 = d(this.f17886a.substring(i10), this.f17887b, this.f17889d);
        this.f17886a = str.substring(0, i10);
        this.f17889d = mVarD2;
        if (i10 < str.length()) {
            this.f17889d.f17890e = d(str.substring(i10), str2, null);
            this.f17887b = null;
            return true;
        }
        this.f17887b = str2;
        return true;
    }
}
