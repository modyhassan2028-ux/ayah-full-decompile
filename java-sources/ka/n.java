package ka;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f19191f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f19192h;

    public n(String str, String str2, String str3, String str4, int i10, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f19186a = str;
        this.f19187b = str2;
        this.f19188c = str3;
        this.f19189d = str4;
        this.f19190e = i10;
        this.f19191f = arrayList2;
        this.g = str5;
        this.f19192h = str6;
    }

    public final String a() {
        if (this.f19188c.length() == 0) {
            return "";
        }
        int length = this.f19186a.length() + 3;
        String str = this.f19192h;
        String strSubstring = str.substring(H9.o.b1(str, ':', length, 4) + 1, H9.o.b1(str, '@', 0, 6));
        p251z9.j.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f19186a.length() + 3;
        String str = this.f19192h;
        int iB1 = H9.o.b1(str, '/', length, 4);
        String strSubstring = str.substring(iB1, la.c.b(iB1, str.length(), str, "?#"));
        p251z9.j.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f19186a.length() + 3;
        String str = this.f19192h;
        int iB1 = H9.o.b1(str, '/', length, 4);
        int iB = la.c.b(iB1, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iB1 < iB) {
            int i10 = iB1 + 1;
            int iC = la.c.c(str, '/', i10, iB);
            String strSubstring = str.substring(i10, iC);
            p251z9.j.d(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iB1 = iC;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f19191f == null) {
            return null;
        }
        String str = this.f19192h;
        int iB1 = H9.o.b1(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iB1, la.c.c(str, '#', iB1, str.length()));
        p251z9.j.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String e() {
        if (this.f19187b.length() == 0) {
            return "";
        }
        int length = this.f19186a.length() + 3;
        String str = this.f19192h;
        String strSubstring = str.substring(length, la.c.b(length, str.length(), str, ":@"));
        p251z9.j.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n) && p251z9.j.a(((n) obj).f19192h, this.f19192h);
    }

    public final String f() {
        m mVar;
        try {
            mVar = new m();
            mVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            mVar = null;
        }
        p251z9.j.b(mVar);
        mVar.f19180b = za.a.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        mVar.f19181c = za.a.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        return mVar.a().f19192h;
    }

    public final URI g() {
        String strSubstring;
        String strReplaceAll;
        m mVar = new m();
        String str = this.f19186a;
        mVar.f19179a = str;
        mVar.f19180b = e();
        mVar.f19181c = a();
        mVar.f19182d = this.f19189d;
        p251z9.j.e(str, "scheme");
        int i10 = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i11 = this.f19190e;
        mVar.f19183e = i11 != i10 ? i11 : -1;
        ArrayList arrayList = mVar.f19184f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        mVar.g = strD != null ? m.d(za.a.a(strD, 0, 0, " \"'<>#", 83)) : null;
        if (this.g == null) {
            strSubstring = null;
        } else {
            String str2 = this.f19192h;
            strSubstring = str2.substring(H9.o.b1(str2, '#', 0, 6) + 1);
            p251z9.j.d(strSubstring, "substring(...)");
        }
        mVar.f19185h = strSubstring;
        String str3 = mVar.f19182d;
        if (str3 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            p251z9.j.d(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str3).replaceAll("");
            p251z9.j.d(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        mVar.f19182d = strReplaceAll;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.set(i12, za.a.a((String) arrayList.get(i12), 0, 0, "[]", 99));
        }
        ArrayList arrayList2 = mVar.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                String str4 = (String) arrayList2.get(i13);
                arrayList2.set(i13, str4 != null ? za.a.a(str4, 0, 0, "\\^`{|}", 67) : null);
            }
        }
        String str5 = mVar.f19185h;
        mVar.f19185h = str5 != null ? za.a.a(str5, 0, 0, " \"#<>\\^`{|}", 35) : null;
        String string = mVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                p251z9.j.d(patternCompile2, "compile(...)");
                p251z9.j.e(string, "input");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                p251z9.j.d(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                p251z9.j.b(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final int hashCode() {
        return this.f19192h.hashCode();
    }

    public final String toString() {
        return this.f19192h;
    }
}
