package p030c9;

import M2.b;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import p056f2.AbstractComponentCallbacksC0947u;

/* JADX INFO: loaded from: classes.dex */
public final class j extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LayoutInflater f13593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f13594b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        super(context);
        context.getClass();
        b bVar = new b(2, this);
        this.f13593a = null;
        abstractComponentCallbacksC0947u.f16154g0.a(bVar);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f13594b == null) {
            if (this.f13593a == null) {
                this.f13593a = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f13594b = this.f13593a.cloneInContext(this);
        }
        return this.f13594b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j(LayoutInflater layoutInflater, AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        super(context);
        b bVar = new b(2, this);
        this.f13593a = layoutInflater;
        abstractComponentCallbacksC0947u.f16154g0.a(bVar);
    }
}
