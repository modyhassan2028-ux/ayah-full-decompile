package p151p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.widget.ActivityChooserView;
import com.ayah.R;

/* JADX INFO: renamed from: p.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1265s extends BaseAdapter {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ActivityChooserView f20771r;

    public C1265s(ActivityChooserView activityChooserView) {
        this.f20771r = activityChooserView;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        throw null;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        throw null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i10) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        ActivityChooserView activityChooserView = this.f20771r;
        if (view == null || view.getId() != R.id.list_item) {
            view = LayoutInflater.from(activityChooserView.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
        }
        activityChooserView.getContext().getPackageManager();
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 3;
    }
}
