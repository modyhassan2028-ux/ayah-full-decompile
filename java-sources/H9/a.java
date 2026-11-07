package H9;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f3610a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        p251z9.j.d(charsetForName, "forName(...)");
        f3610a = charsetForName;
        p251z9.j.d(Charset.forName("UTF-16"), "forName(...)");
        p251z9.j.d(Charset.forName("UTF-16BE"), "forName(...)");
        p251z9.j.d(Charset.forName("UTF-16LE"), "forName(...)");
        p251z9.j.d(Charset.forName("US-ASCII"), "forName(...)");
        p251z9.j.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
