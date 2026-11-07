package D0;

import android.os.Build;
import android.view.MotionEvent;
import com.google.android.gms.internal.measurement.J1;
import java.util.List;

/* JADX INFO: renamed from: D0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0096n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J1 f1120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1122d;

    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    public C0096n(List list, J1 j10) {
        this.f1119a = list;
        this.f1120b = j10;
        MotionEvent motionEvent = j10 != null ? (MotionEvent) ((M.k) j10.f14057d).f5619t : null;
        int i10 = 0;
        this.f1121c = motionEvent != null ? motionEvent.getButtonState() : 0;
        MotionEvent motionEvent2 = j10 != null ? (MotionEvent) ((M.k) j10.f14057d).f5619t : null;
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent3 = j10 != null ? (MotionEvent) ((M.k) j10.f14057d).f5619t : null;
        if (motionEvent3 != null) {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked == 0) {
                i10 = 1;
            } else if (actionMasked == 1) {
                i10 = 2;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 5:
                        i10 = 1;
                        break;
                    case 6:
                        i10 = 2;
                        break;
                    case 7:
                        i10 = 3;
                        break;
                    case 8:
                        i10 = 6;
                        break;
                    case 9:
                        i10 = 4;
                        break;
                    case 10:
                        i10 = 5;
                        break;
                }
            } else {
                i10 = 3;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i10 < size) {
                    v vVar = (v) list.get(i10);
                    if (u.c(vVar)) {
                        i10 = 2;
                    } else if (u.a(vVar)) {
                        i10 = 1;
                    } else {
                        i10++;
                    }
                } else {
                    i10 = 3;
                }
            }
        }
        this.f1122d = i10;
    }

    public final int a() {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        J1 j10 = this.f1120b;
        MotionEvent motionEvent = j10 != null ? (MotionEvent) ((M.k) j10.f14057d).f5619t : null;
        if (motionEvent != null) {
            return motionEvent.getClassification();
        }
        return 0;
    }
}
