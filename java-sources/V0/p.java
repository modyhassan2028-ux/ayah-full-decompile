package V0;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Layout.Alignment f8381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f8382b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (p251z9.j.a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (p251z9.j.a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f8381a = alignment;
        f8382b = alignment2;
    }
}
