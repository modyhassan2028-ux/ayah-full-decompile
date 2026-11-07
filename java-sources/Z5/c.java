package Z5;

import android.view.View;
import android.widget.TextView;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f11012v;

    public c(View view) {
        super(view);
        this.f11012v = view;
        TextView textView = view instanceof TextView ? (TextView) view : null;
        if (textView != null) {
            textView.setTypeface(p106k4.b.f18991b.a(textView.getContext(), 4));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && j.a(this.f11012v, ((c) obj).f11012v);
    }

    public final int hashCode() {
        return this.f11012v.hashCode();
    }

    @Override // E2.F0
    public final String toString() {
        return "BasmalahViewHolder(view=" + this.f11012v + ")";
    }
}
