package Ea;

import H9.o;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f2007a = Logger.getLogger("okio.Okio");

    public static final boolean a(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? o.V0(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }
}
