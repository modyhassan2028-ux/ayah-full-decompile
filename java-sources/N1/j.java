package N1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j implements ActionMode.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionMode.Callback f5994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f5995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class f5996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Method f5997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5999f = false;

    public j(ActionMode.Callback callback, TextView textView) {
        this.f5994a = callback;
        this.f5995b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f5994a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f5994a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f5994a.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        String str;
        TextView textView = this.f5995b;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        boolean z10 = this.f5999f;
        Class<?> cls = Integer.TYPE;
        if (!z10) {
            this.f5999f = true;
            try {
                Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f5996c = cls2;
                this.f5997d = cls2.getDeclaredMethod("removeItemAt", cls);
                this.f5998e = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f5996c = null;
                this.f5997d = null;
                this.f5998e = false;
            }
        }
        try {
            Method declaredMethod = (this.f5998e && this.f5996c.isInstance(menu)) ? this.f5997d : menu.getClass().getDeclaredMethod("removeItemAt", cls);
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i10);
                MenuItem menuItemAdd = menu.add(0, 0, i10 + 100, resolveInfo2.loadLabel(packageManager));
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                menuItemAdd.setIntent(intentPutExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f5994a.onPrepareActionMode(actionMode, menu);
    }
}
