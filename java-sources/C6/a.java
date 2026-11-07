package C6;

import E6.m;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f767f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f769b;

    static {
        String strV = B0.c.V("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f764c = strV;
        String strV2 = B0.c.V("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strV3 = B0.c.V("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f765d = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new B6.b("proto"), new B6.b("json"))));
        f766e = new a(strV, null);
        f767f = new a(strV2, strV3);
    }

    public a(String str, String str2) {
        this.f768a = str;
        this.f769b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}
