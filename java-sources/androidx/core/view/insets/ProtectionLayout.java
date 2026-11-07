package androidx.core.view.insets;

import K0.RunnableC0354l;
import L1.a;
import L1.d;
import android.content.Context;
import android.support.v4.media.session.p;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ayah.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f12342t = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f12343r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f12344s;

    public ProtectionLayout(Context context) {
        super(context);
        this.f12343r = new ArrayList();
    }

    private d getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof d) {
            return (d) tag;
        }
        d dVar = new d(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, dVar);
        return dVar;
    }

    public final void a() {
        ArrayList arrayList = this.f12343r;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f12344s = new a(getOrInstallSystemBarStateMonitor(), arrayList);
        getChildCount();
        if (this.f12344s.f5430a.size() <= 0) {
            return;
        }
        if (this.f12344s.f5430a.get(0) != null) {
            throw new ClassCastException();
        }
        getContext();
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f12342t) {
            a aVar = this.f12344s;
            int childCount = getChildCount() - (aVar != null ? aVar.f5430a.size() : 0);
            if (i10 > childCount || i10 < 0) {
                i10 = childCount;
            }
        }
        super.addView(view, i10, layoutParams);
    }

    public final void b() {
        if (this.f12344s != null) {
            removeViews(getChildCount() - this.f12344s.f5430a.size(), this.f12344s.f5430a.size());
            if (this.f12344s.f5430a.size() > 0) {
                throw p.u(0, this.f12344s.f5430a);
            }
            a aVar = this.f12344s;
            ArrayList arrayList = aVar.f5430a;
            if (!aVar.f5433d) {
                aVar.f5433d = true;
                aVar.f5431b.f5440b.remove(aVar);
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    throw p.u(size, arrayList);
                }
                arrayList.clear();
            }
            this.f12344s = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12344s != null) {
            b();
        }
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof d) {
            d dVar = (d) tag;
            if (dVar.f5440b.isEmpty()) {
                dVar.f5439a.post(new RunnableC0354l(4, dVar));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<Object> list) {
        ArrayList arrayList = this.f12343r;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            b();
            a();
            requestApplyInsets();
        }
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0);
        this.f12343r = new ArrayList();
    }
}
