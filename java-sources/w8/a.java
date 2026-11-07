package w8;

import p180s0.C1292a;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p194t8.a f23792b = new p194t8.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f23793c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f23794d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1292a f23795e = new C1292a(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f23796a;

    public a(c cVar) {
        this.f23796a = cVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb.append(str2.charAt(i10));
            }
        }
        return sb.toString();
    }
}
