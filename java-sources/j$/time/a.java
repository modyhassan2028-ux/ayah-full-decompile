package j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends j$.com.android.tools.r8.a implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f17771b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZoneId f17772a;

    public a(ZoneId zoneId) {
        this.f17772a = zoneId;
    }

    static {
        System.currentTimeMillis();
        f17771b = new a(ZoneOffset.UTC);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f17772a.equals(((a) obj).f17772a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17772a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f17772a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
}
