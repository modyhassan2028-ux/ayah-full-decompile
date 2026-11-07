package R6;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public class g extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public g(Status status) {
        int i10 = status.f13984r;
        String str = status.f13985s;
        super(i10 + ": " + (str == null ? "" : str));
    }
}
