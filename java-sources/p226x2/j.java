package p226x2;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import com.ayah.R;

/* JADX INFO: loaded from: classes.dex */
public final class j implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Preference f24309r;

    public j(Preference preference) {
        this.f24309r = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.f24309r;
        CharSequence charSequenceI = preference.i();
        if (!preference.S || TextUtils.isEmpty(charSequenceI)) {
            return;
        }
        contextMenu.setHeaderTitle(charSequenceI);
        contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.f24309r;
        ClipboardManager clipboardManager = (ClipboardManager) preference.f12761r.getSystemService("clipboard");
        CharSequence charSequenceI = preference.i();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceI));
        Context context = preference.f12761r;
        Toast.makeText(context, context.getString(R.string.preference_copied, charSequenceI), 0).show();
        return true;
    }
}
