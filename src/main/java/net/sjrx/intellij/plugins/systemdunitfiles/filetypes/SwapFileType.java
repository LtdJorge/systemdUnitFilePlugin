package net.sjrx.intellij.plugins.systemdunitfiles.filetypes;

import net.sjrx.intellij.plugins.systemdunitfiles.UnitFileIcon;
import net.sjrx.intellij.plugins.systemdunitfiles.UnitFileLanguage;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

public class SwapFileType extends AbstractUnitFileType {
  public static final SwapFileType INSTANCE = new SwapFileType();

  private SwapFileType() {
    super(UnitFileLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "Swap unit configuration for systemd";
  }

  @NotNull
  @Override
  public String getDescription() {
    return getDisplayName();
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "swap";
  }

  @Nullable
  @Override
  public Icon getIcon() {
    return UnitFileIcon.FILE;
  }
  
  @Nls
  @Override
  public @NotNull String getDisplayName() {
    return "Swap unit configuration (systemd)";
  }
}
