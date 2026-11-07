package Aa;

import java.security.KeyPair;
import java.security.cert.X509Certificate;
import java.util.regex.Pattern;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyPair f560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X509Certificate f561b;

    static {
        j.d(Pattern.compile("-----BEGIN ([!-,.-~ ]*)-----([^-]*)-----END \\1-----"), "compile(...)");
    }

    public c(KeyPair keyPair, X509Certificate x509Certificate) {
        this.f560a = keyPair;
        this.f561b = x509Certificate;
    }
}
