package p034d2;

import android.text.Editable;
import p013b2.w;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f15554a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f15555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f15556c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f15556c;
        return cls != null ? new w(cls, charSequence) : super.newEditable(charSequence);
    }
}
