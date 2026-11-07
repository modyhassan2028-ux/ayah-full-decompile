package O1;

import K0.n1;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p151p.W0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6439r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6440s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Cursor f6441t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6442u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n1 f6443v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a f6444w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c f6445x;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f6441t;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                n1 n1Var = this.f6443v;
                if (n1Var != null) {
                    cursor2.unregisterContentObserver(n1Var);
                }
                a aVar = this.f6444w;
                if (aVar != null) {
                    cursor2.unregisterDataSetObserver(aVar);
                }
            }
            this.f6441t = cursor;
            if (cursor != null) {
                n1 n1Var2 = this.f6443v;
                if (n1Var2 != null) {
                    cursor.registerContentObserver(n1Var2);
                }
                a aVar2 = this.f6444w;
                if (aVar2 != null) {
                    cursor.registerDataSetObserver(aVar2);
                }
                this.f6442u = cursor.getColumnIndexOrThrow("_id");
                this.f6439r = true;
                notifyDataSetChanged();
            } else {
                this.f6442u = -1;
                this.f6439r = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f6439r || (cursor = this.f6441t) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f6439r) {
            return null;
        }
        this.f6441t.moveToPosition(i10);
        if (view == null) {
            W0 w9 = (W0) this;
            view = w9.f20611A.inflate(w9.f20626z, viewGroup, false);
        }
        a(view, this.f6441t);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f6445x == null) {
            c cVar = new c();
            cVar.f6447b = this;
            this.f6445x = cVar;
        }
        return this.f6445x;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        Cursor cursor;
        if (!this.f6439r || (cursor = this.f6441t) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f6441t;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        Cursor cursor;
        if (this.f6439r && (cursor = this.f6441t) != null && cursor.moveToPosition(i10)) {
            return this.f6441t.getLong(this.f6442u);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f6439r) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f6441t.moveToPosition(i10)) {
            throw new IllegalStateException(p123m2.c.r(i10, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f6441t);
        return view;
    }
}
